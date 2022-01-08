package com.airsoft.game.battleroyale;


import com.airsoft.game.battleroyale.api.BattleRoyaleGameDTO;
import com.airsoft.game.battleroyale.api.BattleRoyalePlayerStateDTO;
import com.airsoft.game.geo.LatLongPoint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BattleRoyaleController {

    @Autowired
    BattleRoyaleService battleRoyaleService;

    @RequestMapping(path = "/battle-royale-game", method = RequestMethod.GET)
    public List<BattleRoyaleGameDTO> getBattleRoyaleGames(){
        return battleRoyaleService.getBattleRoyaleGames();
    }

    @RequestMapping(path = "/battle-royale-game/{gameId}", method = RequestMethod.GET)
    public BattleRoyaleGameDTO getBattleRoyaleGame(@PathVariable("gameId") String gameId){
        return battleRoyaleService.getBattleRoyaleGame(gameId);
    }

    @RequestMapping(path = "/battle-royale-game/{gameId}/join", method = RequestMethod.POST)
    public String registerPlayer(@PathVariable("gameId") String gameId){
        return battleRoyaleService.joinNewPlayer(gameId);
    }

    @RequestMapping(path = "/battle-royale-game/{gameId}/{playerId}", method = RequestMethod.GET)
    public BattleRoyalePlayerStateDTO getBattleRoyaleGame(@PathVariable("gameId") String gameId,
                                                          @PathVariable("playerId") String playerId){
        return battleRoyaleService.getBattleRoyaleGameStateForPlayer(gameId, playerId);
    }

    @RequestMapping(path = "/battle-royale-game/{gameId}/{playerId}", method = RequestMethod.POST)
    public void updatePlayerPosition(@PathVariable("gameId") String gameId,
                                                     @PathVariable("playerId") String playerId,
                                                     @RequestBody LatLongPoint latLongPoint){
        battleRoyaleService.playerLocationUpdateToBattleRoyalePlayer(gameId, playerId, latLongPoint);
    }

}
