package environments;

import animals.AnimalType;
import animals.Orc;

/**
 * A class describing the "Dark Trail" environment, where you face an orc named Sargulg
 */
public class DarkTrail extends Environment {
    /**
     * Creates a new instance of Dark Trail
     * @param name The name of the environment
     */
    public DarkTrail(String name) {
        super(name, new Orc("Sargulg the Brutish"));
        animalEffectivenessModifiers.put(AnimalType.AMBUSHER, 1.5);
    }
}
