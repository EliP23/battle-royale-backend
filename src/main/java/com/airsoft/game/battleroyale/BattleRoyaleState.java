package com.airsoft.game.battleroyale;

import com.airsoft.game.geo.LatLongPoint;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import java.util.Stack;


public class BattleRoyaleState {

    private String gameId;
    private List<LatLongPoint> gameBoundary;
    private Instant start;
    private long millisDuration;
    private BattleRoyaleCircle shrinkingCircle;
    private Map<String, Stack<BattleRoyalePlayer>> players;


    public String getGameId() {
        return gameId;
    }

    public void setGameId(String gameId) {
        this.gameId = gameId;
    }

    public List<LatLongPoint> getGameBoundary() {
        return gameBoundary;
    }

    public void setGameBoundary(List<LatLongPoint> gameBoundary) {
        this.gameBoundary = gameBoundary;
    }
}
