package game;

import animals.Animal;
import environments.Environment;

import java.util.ArrayList;

/**
 * Creates a log of the battle and saves it to a file for debug and analysis
 */
public class BattleLog {
    private static BattleLog INSTANCE;

    private final ArrayList<String> logItems = new ArrayList<>();

    /**
     * Get the BattleLog instance, or create one if it has not already been created
     * @return The BattleLog instance
     */
    public static BattleLog getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new BattleLog();
        }
        return INSTANCE;
    }

    private BattleLog() {}

    /**
     * Adds a log message describing the start of battle
     * @param environment The environment the battle is taking place in
     */
    public void startBattle(Environment environment) {
        logItems.add("Started battle in the '" + environment.getName() + "' environment");
    }

    /**
     * Adds a log message describing a new enemy
     * @param enemy The new enemy being described
     */
    public void nowFacing(Animal enemy) {
        logItems.add("Now facing enemy '" + enemy.getName() + "'");
    }
}
