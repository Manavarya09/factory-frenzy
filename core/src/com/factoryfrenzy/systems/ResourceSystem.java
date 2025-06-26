package com.factoryfrenzy.systems;

import com.factoryfrenzy.world.TileMap;

public class ResourceSystem {
    private TileMap tileMap;
    private int ore;
    private int plates;

    public ResourceSystem(TileMap tileMap) {
        this.tileMap = tileMap;
        this.ore = 0;
        this.plates = 0;
    }

    public void update(float delta) {
        // Update resource production/consumption here
    }

    public int getOre() { return ore; }
    public int getPlates() { return plates; }
}
