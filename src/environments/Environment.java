package environments;

import animals.Animal;
import animals.AnimalType;
import hxasjc.utilstuff.data.Concat;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

/**
 * Class containing common behaviour for all environments
 */
public abstract class Environment {
    private static final ArrayList<Environment> environments = new ArrayList<>();

    /**
     * HashMap containing the effectiveness modifiers corresponding to each animal type
     */
    protected final HashMap<AnimalType, Double> animalEffectivenessModifiers = new HashMap<>();

    private String name;
    private Animal enemy;

    /**
     * Used by inheriting classes to create a new environment
     * @param name Name of the environment
     * @param enemy The enemy that the player will be facing
     */
    protected Environment(String name, Animal enemy) {
        this.name = name;
        this.enemy = enemy;

        environments.add(this);
    }

    /**
     * Get the environment's name
     * @return the environment's name
     */
    public String getName() {
        return name;
    }

    /**
     * Get the environment's enemy
     * @return the environment's enemy
     */
    public Animal getEnemy() {
        return enemy;
    }

    /**
     * Get the damage modifier associated to the given type
     * @param type Type of animal to get the modifier for
     * @return The damage modifier
     */
    public double getTypeModifier(AnimalType type) {
        return animalEffectivenessModifiers.getOrDefault(type, 1.0);
    }

    @Override
    public String toString() {
        return "Environment{" +
                "animalEffectivenessModifiers=" + animalEffectivenessModifiers +
                ", name='" + name + '\'' +
                '}';
    }

    /**
     * Get all the environment names as a string
     * @return A string listing all the environment names
     */
    public static String getEnvironmentNames() {
        ArrayList<String> list = new ArrayList<>();
        environments.forEach(env -> list.add(env.name));
        return Concat.LIST_CONCAT.concat(list);
    }

    /**
     * Returns the environment associated with the given name, or random if the name was "random"
     * @param name Name to get the environment for
     * @return The environment associated with the given name
     */
    public static Environment parseEnvironment(String name) {
        name = name.strip();
        if (name.equalsIgnoreCase("random")) {
            int index = new Random().nextInt(environments.size());
            return environments.get(index);
        } else {
            for (Environment env : environments) {
                if (env.getName().equalsIgnoreCase(name)) {
                    return env;
                }
            }
        }
        return null;
    }
}
