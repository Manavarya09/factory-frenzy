package com.factoryfrenzy;

import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration;

public class DesktopLauncher {
    public static void main (String[] arg) {
        Lwjgl3ApplicationConfiguration config = new Lwjgl3ApplicationConfiguration();
        config.setTitle("Factory Frenzy");
        config.setWindowedMode(1024, 768);
        config.useVsync(true);
        config.setForegroundFPS(60);
        new Lwjgl3Application(new MainGame(), config);
    }
}
