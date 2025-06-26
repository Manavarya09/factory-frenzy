package com.factoryfrenzy.ui;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.factoryfrenzy.MainGame;
import com.factoryfrenzy.systems.ResourceSystem;
import com.factoryfrenzy.systems.UpgradeSystem;

public class HUD {
    private MainGame game;
    private ResourceSystem resourceSystem;
    private UpgradeSystem upgradeSystem;
    private BitmapFont font;

    public HUD(MainGame game, ResourceSystem resourceSystem, UpgradeSystem upgradeSystem) {
        this.game = game;
        this.resourceSystem = resourceSystem;
        this.upgradeSystem = upgradeSystem;
        this.font = new BitmapFont();
    }

    public void render() {
        game.batch.begin();
        font.draw(game.batch, "Ore: " + resourceSystem.getOre(), 10, 700);
        font.draw(game.batch, "Plates: " + resourceSystem.getPlates(), 10, 680);
        font.draw(game.batch, "Efficiency: " + upgradeSystem.getEfficiencyLevel(), 10, 660);
        font.draw(game.batch, "Unlocked: Miner=" + upgradeSystem.isUnlocked("Miner") + ", Conveyor=" + upgradeSystem.isUnlocked("Conveyor"), 10, 640);
        game.batch.end();
    }
}
