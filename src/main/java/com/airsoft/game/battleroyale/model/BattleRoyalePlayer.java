package com.airsoft.game.battleroyale.model;

import com.airsoft.game.common.TrackedItem;

public class BattleRoyalePlayer extends TrackedItem {

    private String name;
    private String gameId;
    private boolean alive;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGameId() {
        return gameId;
    }

    public void setGameId(String gameId) {
        this.gameId = gameId;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }
}
