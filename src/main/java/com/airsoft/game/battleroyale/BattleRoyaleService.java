package com.airsoft.game.battleroyale;

import com.airsoft.game.battleroyale.api.BattleRoyaleGameDTO;
import com.airsoft.game.battleroyale.api.BattleRoyalePlayerStateDTO;
import com.airsoft.game.battleroyale.api.GameJoinRequest;
import com.airsoft.game.battleroyale.model.BattleRoyaleGame;
import com.airsoft.game.battleroyale.model.BattleRoyalePlayer;
import com.airsoft.game.battleroyale.common.LatLongPoint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;


/**
 *
 * This is a service-layer class that will handle DTO/api objects from the Controller and perform game logic.
 * It has a dependency on the BattleRoyaleDAO to be able to query game data from the data store.
 *
 * @author Ryan Pelletier
 */
@Component
public class BattleRoyaleService {

    @Autowired
    BattleRoyaleDAO battleRoyaleDAO;


    public String joinNewPlayer(String gameId, GameJoinRequest gameJoinRequest){
        String playerId = UUID.randomUUID().toString();
        battleRoyaleDAO.addPlayerToGame(gameId, playerId, gameJoinRequest);
        return playerId;
    }

    public BattleRoyalePlayer playerLocationUpdateToBattleRoyalePlayer(String gameId, String playerId, LatLongPoint latLongPoint){
        BattleRoyalePlayer battleRoyalePlayer = new BattleRoyalePlayer();
        battleRoyalePlayer.setId(gameId);
        battleRoyalePlayer.setId(playerId);
        battleRoyalePlayer.setLocation(latLongPoint);
        //TODO check if player should be alive and set that
        return  battleRoyalePlayer;
    }

    public BattleRoyalePlayerStateDTO getBattleRoyaleGameStateForPlayer(String gameId, String playerId) {

        BattleRoyaleGame battleRoyaleGame = battleRoyaleDAO.getBattleRoyaleGame(gameId);

        BattleRoyalePlayerStateDTO battleRoyaleGameStateDTO = new BattleRoyalePlayerStateDTO();

        // set amount of time remaining in the game
        battleRoyaleGameStateDTO.setTimeRemainingMillis(ChronoUnit.MILLIS.between(battleRoyaleGame.getStartTime(),
                Instant.now()));

        //get current player's most recent position as lat/long pair
        battleRoyaleGameStateDTO.setUserLocation(battleRoyaleGame.getPlayers().get(playerId).peek().getLocation());

        //check if player is alive (like if the circle should have killed them)
        //TODO

        return battleRoyaleGameStateDTO;
    }

    public void saveBattleRoyaleState(BattleRoyaleGame battleRoyaleGame) {
        battleRoyaleDAO.saveBattleRoyaleState(battleRoyaleGame);
    }

    public void updatePlayerPosition(String gameId, BattleRoyalePlayer battleRoyalePlayer) {
        BattleRoyaleGame battleRoyaleGame = battleRoyaleDAO.getBattleRoyaleGame(gameId);
        battleRoyalePlayer.setTime(Instant.now());
        battleRoyaleGame.getPlayers().get(battleRoyalePlayer.getId()).push(battleRoyalePlayer);
    }

    public List<BattleRoyaleGameDTO> getBattleRoyaleGames() {
        return battleRoyaleDAO.getBattleRoyaleGames().stream()
                .map(this::battleRoyaleGameDTOFromBattleRoyaleGame).collect(Collectors.toList());
    }

    public BattleRoyaleGameDTO getBattleRoyaleGame(String gameId) {
        return battleRoyaleGameDTOFromBattleRoyaleGame(battleRoyaleDAO.getBattleRoyaleGame(gameId));
    }

    private BattleRoyaleGameDTO battleRoyaleGameDTOFromBattleRoyaleGame(BattleRoyaleGame battleRoyaleGame){
        BattleRoyaleGameDTO battleRoyaleGameDTO = new BattleRoyaleGameDTO();
        battleRoyaleGameDTO.setGameId(battleRoyaleGame.getGameId());
        battleRoyaleGameDTO.setGameName(battleRoyaleGame.getGameName());
        battleRoyaleGameDTO.setGameBoundary(battleRoyaleGame.getGameBoundary());
        battleRoyaleGameDTO.setMillisDuration(battleRoyaleGame.getMillisDuration());
        return battleRoyaleGameDTO;
    }
}
