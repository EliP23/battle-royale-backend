package com.airsoft.game.battleroyale;

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
    public void addPlayerToGame(String gameId, String playerId) {
        battleRoyaleStateMap.get(gameId).getPlayers().put(playerId, new Stack<>());
    }

    @Override
    public void updatePlayerPosition(BattleRoyalePlayer battleRoyalePlayer) {
        BattleRoyaleGame battleRoyaleGame = this.getBattleRoyaleGame(battleRoyalePlayer.getGameId());
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
