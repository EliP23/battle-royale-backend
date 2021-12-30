package com.airsoft.game.position;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PositionController {

    @Autowired
    private PositionService ps;

    @RequestMapping(path = "/position", method = RequestMethod.GET)
    public List<Position> getAllPositions(){
        return ps.getAllPositions();
    }

    @RequestMapping(path = "position/{id}", method = RequestMethod.GET)
    public Position getPositionObject(@PathVariable String id) {
        return ps.getPosition(id);
    }

    @RequestMapping(path = "/position" , method = RequestMethod.POST)
    public void savePosition(@RequestBody Position p) {
        ps.createPosition(p);
    }

    @RequestMapping(path = "position/{id}" , method = RequestMethod.DELETE)
    public void deletePosition(@PathVariable String id){
        ps.deletePosition(id);
    }
}