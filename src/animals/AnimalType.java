package animals;

/**
 * Animal types (similar to classes). They offer unique behaviours
 */
public enum AnimalType {
    /**
     * A Brute animal
     */
    BRUTE(null, null),
    /**
     * An Ambusher animal
     */
    AMBUSHER(null, null);

    private AnimalType strength;
    private AnimalType weakness;

    AnimalType(AnimalType strength, AnimalType weakness) {
        this.strength = strength;
        this.weakness = weakness;
    }
}
