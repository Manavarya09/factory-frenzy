package com.factoryfrenzy.systems;

import java.util.HashSet;
import java.util.Set;

public class UpgradeSystem {
    private Set<String> unlockedBuildings;
    private int efficiencyLevel;

    public UpgradeSystem() {
        unlockedBuildings = new HashSet<>();
        efficiencyLevel = 1;
        unlock("Miner");
        unlock("Conveyor");
    }

    public void unlock(String building) {
        unlockedBuildings.add(building);
    }

    public boolean isUnlocked(String building) {
        return unlockedBuildings.contains(building);
    }

    public void upgradeEfficiency() {
        efficiencyLevel++;
    }

    public int getEfficiencyLevel() {
        return efficiencyLevel;
    }
} 