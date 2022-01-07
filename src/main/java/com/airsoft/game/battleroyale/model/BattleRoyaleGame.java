package com.airsoft.game.battleroyale.model;

import com.airsoft.game.battleroyale.common.AbstractBattleRoyaleGame;
import com.airsoft.game.battleroyale.dto.BattleRoyaleCircleDTO;

import java.time.Instant;
import java.util.Map;
import java.util.Stack;


public class BattleRoyaleGame extends AbstractBattleRoyaleGame {

    private Instant start;
    private BattleRoyaleCircleDTO shrinkingCircle;
    private Map<String, Stack<BattleRoyalePlayer>> players;

    public Instant getStart() {
        return start;
    }

    public void setStart(Instant start) {
        this.start = start;
    }

    public BattleRoyaleCircleDTO getShrinkingCircle() {
        return shrinkingCircle;
    }

    public void setShrinkingCircle(BattleRoyaleCircleDTO shrinkingCircle) {
        this.shrinkingCircle = shrinkingCircle;
    }

    public Map<String, Stack<BattleRoyalePlayer>> getPlayers() {
        return players;
    }

    public void setPlayers(Map<String, Stack<BattleRoyalePlayer>> players) {
        this.players = players;
    }
}
