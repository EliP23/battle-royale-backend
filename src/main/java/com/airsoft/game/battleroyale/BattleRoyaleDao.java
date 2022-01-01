package com.airsoft.game.battleroyale;

import java.util.List;

public interface BattleRoyaleDao {

    void saveBattleRoyaleState(BattleRoyaleState battleRoyaleState);

    List<BattleRoyaleState> getBattleRoyaleGames();

    BattleRoyaleState getBattleRoyaleGame(String gameId);

}
