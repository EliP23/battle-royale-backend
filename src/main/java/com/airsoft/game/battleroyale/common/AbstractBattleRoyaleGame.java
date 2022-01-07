package com.airsoft.game.battleroyale.common;

import com.airsoft.game.geo.LatLongPoint;

import java.util.List;

/**
 * Some common attributes for BattleRoyaleGameDTO and BattleRoyaleGame
 *
 * @author Ryan Pelletier
 */
public abstract class AbstractBattleRoyaleGame {

    private String gameName;
    private String gameId;
    private List<LatLongPoint> gameBoundary;
    private long millisDuration;

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

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

    public long getMillisDuration() {
        return millisDuration;
    }

    public void setMillisDuration(long millisDuration) {
        this.millisDuration = millisDuration;
    }
}
