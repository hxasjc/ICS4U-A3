package animals;

/**
 * The class representing the Orc species
 */
public class Orc extends Animal {
    /**
     * Create a new Orc with the given name
     * @param name The new Orc's name
     */
    public Orc(String name) {
        super(name, AnimalType.BRUTE, 10, new AnimalAbility("Ability 1", "this is the first ability", 1));
    }
}
