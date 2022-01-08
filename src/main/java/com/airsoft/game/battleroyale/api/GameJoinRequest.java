package com.airsoft.game.battleroyale.api;

import com.airsoft.game.geo.LatLongPoint;

public class GameJoinRequest {

    private String name;
    private LatLongPoint location;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LatLongPoint getLocation() {
        return location;
    }

    public void setLocation(LatLongPoint location) {
        this.location = location;
    }
}
