package com.factoryfrenzy.entities;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.Gdx;

public class Miner extends Entity {
    private Texture texture;
    private float mineTimer;
    private static final float MINE_INTERVAL = 2f;

    public Miner(int x, int y) {
        super(x, y);
        texture = new Texture(Gdx.files.internal("assets/textures/placeholder.png"));
        mineTimer = 0f;
    }

    @Override
    public void update(float delta) {
        mineTimer += delta;
        if (mineTimer >= MINE_INTERVAL) {
            // Output resource logic here
            mineTimer = 0f;
        }
    }

    @Override
    public void render(SpriteBatch batch) {
        batch.draw(texture, x * 32, y * 32, 32, 32);
    }
}
