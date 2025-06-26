package com.factoryfrenzy.systems;

import com.factoryfrenzy.world.TileMap;

public class BotSystem {
    private TileMap tileMap;

    public BotSystem(TileMap tileMap) {
        this.tileMap = tileMap;
    }

    public void update(float delta) {
        // Update bots, pathfinding, and repairs here
    }
}
