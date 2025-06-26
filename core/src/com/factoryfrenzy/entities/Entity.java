package com.factoryfrenzy.entities;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public abstract class Entity {
    protected int x, y;
    protected float rotation;

    public Entity(int x, int y) {
        this.x = x;
        this.y = y;
        this.rotation = 0f;
    }

    public abstract void update(float delta);
    public abstract void render(SpriteBatch batch);

    public int getX() { return x; }
    public int getY() { return y; }
    public float getRotation() { return rotation; }
    public void setRotation(float rotation) { this.rotation = rotation; }
}
