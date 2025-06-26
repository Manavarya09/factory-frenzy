package com.factoryfrenzy.world;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.Gdx;

public class TileMap {
    public static final int WIDTH = 32;
    public static final int HEIGHT = 18;
    public static final int TILE_SIZE = 32;
    private TileType[][] tiles;
    private Texture placeholder;

    public TileMap() {
        tiles = new TileType[WIDTH][HEIGHT];
        placeholder = new Texture(Gdx.files.internal("assets/textures/placeholder.png"));
        loadTestLevel();
    }

    private void loadTestLevel() {
        for (int x = 0; x < WIDTH; x++) {
            for (int y = 0; y < HEIGHT; y++) {
                if (y < 3) tiles[x][y] = TileType.WATER;
                else if (x > 20 && y > 10) tiles[x][y] = TileType.ORE;
                else tiles[x][y] = TileType.LAND;
            }
        }
    }

    public TileType getTile(int x, int y) {
        if (x < 0 || y < 0 || x >= WIDTH || y >= HEIGHT) return TileType.LAND;
        return tiles[x][y];
    }

    public void render(SpriteBatch batch) {
        for (int x = 0; x < WIDTH; x++) {
            for (int y = 0; y < HEIGHT; y++) {
                batch.draw(placeholder, x * TILE_SIZE, y * TILE_SIZE, TILE_SIZE, TILE_SIZE);
            }
        }
    }
}
