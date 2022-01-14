package com.airsoft.game.battleroyale.common;

import java.util.List;

/**
 * Some common attributes for BattleRoyaleGameDTO and BattleRoyaleGame
 *
 * @author Ryan Pelletier
 */
public abstract class AbstractBattleRoyaleGame {

    private String gameName;
    private String gameId;
    private List<LatLongPoint> safeZone;
    private List<LatLongPoint> gameBoundary;
    private Long millisDuration;

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

    public List<LatLongPoint> getSafeZone() {
        return safeZone;
    }

    public void setSafeZone(List<LatLongPoint> safeZone) {
        this.safeZone = safeZone;
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
