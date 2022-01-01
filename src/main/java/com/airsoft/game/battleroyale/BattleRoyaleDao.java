package com.airsoft.game.battleroyale;

import java.util.List;

public interface BattleRoyaleDao {

    void saveBattleRoyaleState(BattleRoyaleState battleRoyaleState);

    void updatePlayerPosition(BattleRoyalePlayer battleRoyalePlayer);

    List<BattleRoyaleState> getBattleRoyaleGames();

    BattleRoyaleState getBattleRoyaleGame(String gameId);

}
