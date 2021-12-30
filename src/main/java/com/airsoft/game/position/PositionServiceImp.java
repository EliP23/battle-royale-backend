package com.airsoft.game.position;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PositionServiceImp implements PositionService{

    List<Position> positions = new ArrayList<Position>();
    @Override
    public List<Position> getAllPositions() {
        return positions;
    }

    @Override
    public Position getPosition(String id) {
        for (int i = 0; i < positions.size(); i++) {
            if (positions.get(i).getId() == id) {
                return positions.get(i);
            }
        }
        return null;
    }

    @Override
    public void deletePosition(String id) {
        for(int i = 0; i <positions.size(); i++){
            if(positions.get(i).getId() == id){
                positions.remove(i);
            }
        }
    }

    @Override
    public void createPosition(Position p) {
        positions.add(p);
    }
}
