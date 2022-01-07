package com.airsoft.game.battleroyale.dto;

import com.airsoft.game.geo.LatLongPoint;

/**
 * Describes the safe zone and "blue" zone.
 *
 * @author Ryan Pelletier
 */
public class BattleRoyaleCircleDTO {

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
