package com.airsoft.game.battleroyale;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BattleRoyaleGameController {

    @Autowired
    BattleRoyaleDao battleRoyaleDao;

    @RequestMapping(path = "/battle-royale-game", method = RequestMethod.GET)
    public List<BattleRoyaleState> getBattleRoyaleGames(){
        return battleRoyaleDao.getBattleRoyaleGames();
    }

}
