package com.factoryfrenzy.world;

public enum TileType {
    LAND(true, 0x88C070FF),
    ORE(true, 0xA0A0A0FF),
    WATER(false, 0x4060B0FF);

    public final boolean passable;
    public final int color;

    TileType(boolean passable, int color) {
        this.passable = passable;
        this.color = color;
    }
}
