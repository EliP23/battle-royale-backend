package com.airsoft.game.position;

import java.util.List;

public interface PositionService {
    public List<Position> getAllPositions();
    public Position getPosition(String id);
    public void deletePosition(String id);
    public void createPosition(Position p);
}
