package com.airsoft.game.battleroyale;

import com.airsoft.game.geo.LatLongPoint;

public class BattleRoyaleCircle {

    private LatLongPoint center;
    private double radius;

    public LatLongPoint getCenter() {
        return center;
    }

    public void setCenter(LatLongPoint center) {
        this.center = center;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
