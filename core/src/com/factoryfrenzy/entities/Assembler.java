package com.factoryfrenzy.entities;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.Gdx;

public class Assembler extends Entity {
    private Texture texture;
    private float assembleTimer;
    private static final float ASSEMBLE_INTERVAL = 3f;

    public Assembler(int x, int y) {
        super(x, y);
        texture = new Texture(Gdx.files.internal("assets/textures/placeholder.png"));
        assembleTimer = 0f;
    }

    @Override
    public void update(float delta) {
        assembleTimer += delta;
        if (assembleTimer >= ASSEMBLE_INTERVAL) {
            // Combine resources logic here
            assembleTimer = 0f;
        }
    }

    @Override
    public void render(SpriteBatch batch) {
        batch.draw(texture, x * 32, y * 32, 32, 32);
    }
}
