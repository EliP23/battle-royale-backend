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

    public Instant getStart() {
        return start;
    }

    public void setStart(Instant start) {
        this.start = start;
    }

    public long getMillisDuration() {
        return millisDuration;
    }

    public void setMillisDuration(long millisDuration) {
        this.millisDuration = millisDuration;
    }

    public BattleRoyaleCircle getShrinkingCircle() {
        return shrinkingCircle;
    }

    public void setShrinkingCircle(BattleRoyaleCircle shrinkingCircle) {
        this.shrinkingCircle = shrinkingCircle;
    }

    public Map<String, Stack<BattleRoyalePlayer>> getPlayers() {
        return players;
    }

    public void setPlayers(Map<String, Stack<BattleRoyalePlayer>> players) {
        this.players = players;
    }
}
