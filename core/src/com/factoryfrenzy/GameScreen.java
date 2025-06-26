package com.factoryfrenzy;

import com.badlogic.gdx.Screen;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.factoryfrenzy.world.TileMap;
import com.factoryfrenzy.systems.ResourceSystem;
import com.factoryfrenzy.systems.PowerSystem;
import com.factoryfrenzy.systems.BotSystem;
import com.factoryfrenzy.ui.HUD;
import com.factoryfrenzy.systems.UpgradeSystem;
import com.factoryfrenzy.systems.SaveLoadSystem;

public class GameScreen implements Screen {
    private final MainGame game;
    private TileMap tileMap;
    private ResourceSystem resourceSystem;
    private PowerSystem powerSystem;
    private BotSystem botSystem;
    private UpgradeSystem upgradeSystem;
    private SaveLoadSystem saveLoadSystem;
    private HUD hud;

    public GameScreen(MainGame game) {
        this.game = game;
        tileMap = new TileMap();
        resourceSystem = new ResourceSystem(tileMap);
        powerSystem = new PowerSystem(tileMap);
        botSystem = new BotSystem(tileMap);
        upgradeSystem = new UpgradeSystem();
        saveLoadSystem = new SaveLoadSystem();
        hud = new HUD(game, resourceSystem, upgradeSystem);
    }

    @Override
    public void show() {}

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(0.1f, 0.1f, 0.15f, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        if (Gdx.input.isKeyJustPressed(com.badlogic.gdx.Input.Keys.U)) {
            upgradeSystem.upgradeEfficiency();
        }
        if (Gdx.input.isKeyJustPressed(com.badlogic.gdx.Input.Keys.S)) {
            saveLoadSystem.save(this, "savegame.json");
        }
        if (Gdx.input.isKeyJustPressed(com.badlogic.gdx.Input.Keys.L)) {
            // Example: load game state (not fully implemented)
            // saveLoadSystem.load(GameScreen.class, "savegame.json");
        }

        game.batch.begin();
        tileMap.render(game.batch);
        game.batch.end();

        resourceSystem.update(delta);
        powerSystem.update(delta);
        botSystem.update(delta);

        hud.render();
    }

    @Override
    public void resize(int width, int height) {}
    @Override
    public void pause() {}
    @Override
    public void resume() {}
    @Override
    public void hide() {}
    @Override
    public void dispose() {}
}
