package com.airsoft.game.battleroyale;

import com.airsoft.game.battleroyale.api.GameJoinRequest;
import com.airsoft.game.battleroyale.model.BattleRoyaleGame;
import com.airsoft.game.battleroyale.model.BattleRoyalePlayer;
import org.springframework.stereotype.Component;

import java.time.Instant;
import java.util.*;

@Component
public class InMemoryBattleRoyaleDao implements BattleRoyaleDAO {

    private Map<String, BattleRoyaleGame> battleRoyaleStateMap = new HashMap<>();

    @Override
    public void saveBattleRoyaleState(BattleRoyaleGame battleRoyaleGame) {
        battleRoyaleStateMap.put(battleRoyaleGame.getGameId(), battleRoyaleGame);
    }

    @Override
    public void addPlayerToGame(String gameId, String playerId, GameJoinRequest gameJoinRequest) {
        battleRoyaleStateMap.get(gameId).getPlayers().put(playerId, new Stack<>());

        BattleRoyalePlayer battleRoyalePlayer = new BattleRoyalePlayer();
        battleRoyalePlayer.setId(playerId);
        battleRoyalePlayer.setLocation(gameJoinRequest.getLocation());
        battleRoyalePlayer.setName(gameJoinRequest.getName());
        battleRoyalePlayer.setTime(Instant.now());
        battleRoyalePlayer.setAlive(true);

        battleRoyaleStateMap.get(gameId).getPlayers().get(playerId).push(battleRoyalePlayer);
    }

    @Override
    public void updatePlayerPosition(String gameId, BattleRoyalePlayer battleRoyalePlayer) {
        BattleRoyaleGame battleRoyaleGame = this.getBattleRoyaleGame(battleRoyalePlayer.getId());
        battleRoyalePlayer.setTime(Instant.now());
        battleRoyaleGame.getPlayers().computeIfAbsent(battleRoyalePlayer.getId(), k -> new Stack<>());
        battleRoyaleGame.getPlayers().get(battleRoyalePlayer.getId()).push(battleRoyalePlayer);
    }

    @Override
    public List<BattleRoyaleGame> getBattleRoyaleGames() {
        return new ArrayList<>(battleRoyaleStateMap.values());
    }

    @Override
    public BattleRoyaleGame getBattleRoyaleGame(String gameId) {
        return battleRoyaleStateMap.get(gameId);
    }

}
