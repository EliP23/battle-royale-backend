package com.airsoft.game.battleroyale;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BattleRoyaleGameController {

    @Autowired
    BattleRoyaleDAO battleRoyaleDao;

    @RequestMapping(path = "/battle-royale-game", method = RequestMethod.GET)
    public List<BattleRoyaleState> getBattleRoyaleGames(){
        return battleRoyaleDao.getBattleRoyaleGames();
    }

    @RequestMapping(path = "/battle-royale-game/{gameId}", method = RequestMethod.GET)
    public BattleRoyaleState getBattleRoyaleGame(@PathVariable("gameId") String gameId){
        return battleRoyaleDao.getBattleRoyaleGame(gameId);
    }

    @RequestMapping(path = "/battle-royale-game/{gameId}/{playerId}", method = RequestMethod.GET)
    public BattleRoyaleState getBattleRoyaleGame(@PathVariable("gameId") String gameId,
                                                 @PathVariable("playerId") String playerId){
        return battleRoyaleDao.getBattleRoyaleGame(gameId);
    }

}
