package game;

import animals.Animal;
import environments.Environment;
import hxasjc.utilstuff.data.Concat;
import hxasjc.utilstuff.util.GeneralUtility;

/**
 * Holds the logic for each game/battle
 */
public class Game extends GeneralUtility {
    private final Environment environment;
    private Animal enemy;

    /**
     * Create a new game in the given environment
     * @param environment The environment to base the battle in
     */
    public Game(Environment environment) {
        this.environment = environment;
        this.enemy = environment.getEnemy();

        println(Concat.NO_SEPARATOR, "Now playing in ", environment);
        println(Concat.NO_SEPARATOR, "You are now fighting ", enemy);
    }
}
