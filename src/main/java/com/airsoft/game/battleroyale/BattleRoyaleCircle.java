package com.airsoft.game.battleroyale;

import com.airsoft.game.geo.LatLongPoint;

public class BattleRoyaleCircle {

    private LatLongPoint center;
    private double radiusMeters;
    private String label;

    public LatLongPoint getCenter() {
        return center;
    }

    public void setCenter(LatLongPoint center) {
        this.center = center;
    }

    public double getRadiusMeters() {
        return radiusMeters;
    }

    public void setRadiusMeters(double radiusMeters) {
        this.radiusMeters = radiusMeters;
    }
}
