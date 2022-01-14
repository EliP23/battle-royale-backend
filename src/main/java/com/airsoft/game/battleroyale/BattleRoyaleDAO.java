package com.airsoft.game.battleroyale;

import com.airsoft.game.battleroyale.api.GameJoinRequest;
import com.airsoft.game.battleroyale.model.BattleRoyaleGame;
import com.airsoft.game.battleroyale.model.BattleRoyalePlayer;

import java.util.List;

public interface BattleRoyaleDAO {

    void saveBattleRoyaleState(BattleRoyaleGame battleRoyaleGame);

    void addPlayerToGame(String gameId, String playerId, GameJoinRequest gameJoinRequest);

    void updatePlayerPosition(String gameId, BattleRoyalePlayer battleRoyalePlayer);

    List<BattleRoyaleGame> getBattleRoyaleGames();

    BattleRoyaleGame getBattleRoyaleGame(String gameId);

}
