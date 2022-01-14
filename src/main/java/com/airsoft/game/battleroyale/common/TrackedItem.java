package com.airsoft.game.battleroyale.common;

import java.time.Instant;

public class TrackedItem {

    private String id;
    private Instant time;
    private LatLongPoint location;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Instant getTime() {
        return time;
    }

    public void setTime(Instant time) {
        this.time = time;
    }

    public LatLongPoint getLocation() {
        return location;
    }

    public void setLocation(LatLongPoint location) {
        this.location = location;
    }
}
