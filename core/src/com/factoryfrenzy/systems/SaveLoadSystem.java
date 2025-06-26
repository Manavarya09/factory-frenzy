package com.factoryfrenzy.systems;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.utils.Json;

public class SaveLoadSystem {
    private Json json;

    public SaveLoadSystem() {
        json = new Json();
    }

    public void save(Object gameState, String filename) {
        FileHandle file = Gdx.files.local("assets/levels/" + filename);
        file.writeString(json.prettyPrint(gameState), false);
    }

    public <T> T load(Class<T> type, String filename) {
        FileHandle file = Gdx.files.local("assets/levels/" + filename);
        if (!file.exists()) return null;
        return json.fromJson(type, file.readString());
    }
} 