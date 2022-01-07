package com.airsoft.game.battleroyale;

import java.util.List;

public interface BattleRoyaleDAO {

    void saveBattleRoyaleState(BattleRoyaleState battleRoyaleState);

    void updatePlayerPosition(BattleRoyalePlayer battleRoyalePlayer);

    List<BattleRoyaleState> getBattleRoyaleGames();

    BattleRoyaleState getBattleRoyaleGame(String gameId);

    BattleRoyaleGameStateDTO getBattleRoyaleGameStateForPlayer(String gameId, String playerId);

}
