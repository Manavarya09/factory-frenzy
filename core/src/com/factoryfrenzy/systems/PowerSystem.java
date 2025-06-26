package com.factoryfrenzy.systems;

import com.factoryfrenzy.world.TileMap;

public class PowerSystem {
    private TileMap tileMap;
    private int powerGenerated;
    private int powerUsed;

    public PowerSystem(TileMap tileMap) {
        this.tileMap = tileMap;
        this.powerGenerated = 0;
        this.powerUsed = 0;
    }

    public void update(float delta) {
        // Update power generation/consumption here
    }

    public int getPowerGenerated() { return powerGenerated; }
    public int getPowerUsed() { return powerUsed; }
}
