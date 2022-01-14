package com.airsoft.game.battleroyale.model;

import com.airsoft.game.battleroyale.common.TrackedItem;

public class BattleRoyalePlayer extends TrackedItem {

    private String name;
    private boolean alive;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }
}
