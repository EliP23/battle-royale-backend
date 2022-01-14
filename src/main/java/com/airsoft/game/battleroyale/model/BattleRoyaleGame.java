package com.airsoft.game.battleroyale.model;

import com.airsoft.game.battleroyale.common.AbstractBattleRoyaleGame;

import java.time.Instant;
import java.util.Map;
import java.util.Stack;


/**
 * Holds the state of a Battle Royale game.
 *
 * @author Ryan Pelletier
 */
public class BattleRoyaleGame extends AbstractBattleRoyaleGame {

    private Instant startTime;
    private Boolean running;
    private Map<String, Stack<BattleRoyalePlayer>> players;

    public Instant getStartTime() {
        return startTime;
    }

    public void setStartTime(Instant startTime) {
        this.startTime = startTime;
    }

    public boolean isRunning() {
        return running;
    }

    public void setRunning(boolean running) {
        this.running = running;
    }

    public Map<String, Stack<BattleRoyalePlayer>> getPlayers() {
        return players;
    }

    public void setPlayers(Map<String, Stack<BattleRoyalePlayer>> players) {
        this.players = players;
    }
}
