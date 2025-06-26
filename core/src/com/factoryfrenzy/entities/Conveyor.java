package com.factoryfrenzy.entities;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.Gdx;

public class Conveyor extends Entity {
    private Texture texture;
    private float animTimer;

    public Conveyor(int x, int y) {
        super(x, y);
        texture = new Texture(Gdx.files.internal("assets/textures/placeholder.png"));
        animTimer = 0f;
    }

    @Override
    public void update(float delta) {
        animTimer += delta;
        // Move items visually (animation logic here)
    }

    @Override
    public void render(SpriteBatch batch) {
        batch.draw(texture, x * 32, y * 32, 16, 16, 32, 32, 1, 1, rotation, 0, 0, 32, 32, false, false);
    }
}
