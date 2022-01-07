package com.airsoft.game.battleroyale;

import com.airsoft.game.geo.LatLongPoint;

/**
 *
 * This object represents the game state that is sent to the client.
 * This will be what is needed to be displayed to the user.
 *
 * @author Ryan Pelletier
 */
public class BattleRoyaleGameStateDTO {

    private LatLongPoint userLocation;
    private long timeRemainingMillis;
    private BattleRoyaleCircle whiteCircle;
    private BattleRoyaleCircle blueCircle;

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

    public BattleRoyaleCircle getWhiteCircle() {
        return whiteCircle;
    }

    public void setWhiteCircle(BattleRoyaleCircle whiteCircle) {
        this.whiteCircle = whiteCircle;
    }

    public BattleRoyaleCircle getBlueCircle() {
        return blueCircle;
    }

    public void setBlueCircle(BattleRoyaleCircle blueCircle) {
        this.blueCircle = blueCircle;
    }
}
