import environments.DarkTrail;
import environments.Environment;
import game.Game;
import hxasjc.utilstuff.data.Concat;
import hxasjc.utilstuff.util.GeneralUtility;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

/**
 * Selects an environment and starts a game, as well as other init stuff
 */
public class Main extends GeneralUtility {
    private static final Logger LOGGER = LogManager.getLogger();

    private static final String GAME_NAME = "Unnamed Game";
    private static final Scanner scanner = new Scanner(System.in);

    /**
     * Start program
     * @param args Program launch args
     */
    public static void main(String[] args) {
        Thread.setDefaultUncaughtExceptionHandler((t, e) -> {
            LOGGER.error("Uncaught Exception", e);
        });

        DarkTrail darkTrail = new DarkTrail("Dark Trail");

        println("Welcome to", GAME_NAME, "\b!");
        println("What environment would you like to play in?", "Enter a name (case-insensitive) or 'random'.");
        println(Environment.getEnvironmentNames());

        while (true) {
            String in = scanner.nextLine();
            Environment env = Environment.parseEnvironment(in);
            if (env == null) {
                println(Concat.NO_SEPARATOR, "Could not find environment with name '", in, "'");
            } else {
                new Game(env);
                break;
            }
        }
    }
}
