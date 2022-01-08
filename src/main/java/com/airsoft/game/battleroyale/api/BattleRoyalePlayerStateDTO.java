package com.airsoft.game.battleroyale.api;

import com.airsoft.game.geo.LatLongPoint;

/**
 *
 * This object represents the game state that is sent to the client.
 * This will be what is needed to be displayed to the user.
 *
 * @author Ryan Pelletier
 */
public class BattleRoyalePlayerStateDTO {

    private LatLongPoint userLocation;
    private long timeRemainingMillis;
    private boolean alive;
    private BattleRoyaleCircleDTO whiteCircle;
    private BattleRoyaleCircleDTO blueCircle;

    public LatLongPoint getUserLocation() {
        return userLocation;
    }

    public void setUserLocation(LatLongPoint userLocation) {
        this.userLocation = userLocation;
    }

    public long getTimeRemainingMillis() {
        return timeRemainingMillis;
    }

    public void setTimeRemainingMillis(long timeRemainingMillis) {
        this.timeRemainingMillis = timeRemainingMillis;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public BattleRoyaleCircleDTO getWhiteCircle() {
        return whiteCircle;
    }

    public void setWhiteCircle(BattleRoyaleCircleDTO whiteCircle) {
        this.whiteCircle = whiteCircle;
    }

    public BattleRoyaleCircleDTO getBlueCircle() {
        return blueCircle;
    }

    public void setBlueCircle(BattleRoyaleCircleDTO blueCircle) {
        this.blueCircle = blueCircle;
    }
}
