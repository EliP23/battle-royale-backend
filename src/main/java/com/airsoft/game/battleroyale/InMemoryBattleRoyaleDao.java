package com.airsoft.game.battleroyale;

import org.springframework.stereotype.Component;

import java.time.Instant;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class InMemoryBattleRoyaleDao implements BattleRoyaleDao {

    private Map<String, BattleRoyaleState> battleRoyaleStateMap = new HashMap<>();

    @Override
    public void saveBattleRoyaleState(BattleRoyaleState battleRoyaleState) {
        battleRoyaleStateMap.put(battleRoyaleState.getGameId(), battleRoyaleState);
    }

    @Override
    public void updatePlayerPosition(BattleRoyalePlayer battleRoyalePlayer) {
        String gameId = battleRoyalePlayer.getGameId();
        BattleRoyaleState battleRoyaleGame = this.getBattleRoyaleGame(gameId);
        battleRoyalePlayer.setTime(Instant.now());
        battleRoyaleGame.getPlayers().get(battleRoyalePlayer.getId()).push(battleRoyalePlayer);
    }

    @Override
    public List<BattleRoyaleState> getBattleRoyaleGames() {
        return new ArrayList<>(battleRoyaleStateMap.values());
    }

    @Override
    public BattleRoyaleState getBattleRoyaleGame(String gameId) {
        return battleRoyaleStateMap.get(gameId);
    }
}
