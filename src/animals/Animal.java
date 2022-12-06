package animals;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/**
 * Common parent of all animal classes. Contains common methods
 */
public abstract class Animal {
    private String name;
    private final AnimalType type;
    private final List<AnimalAbility> abilities;
    private final double maxHealth;
    private double health;

    private final HashSet<AnimalTrait> offensiveTraits = new HashSet<>();
    private final HashSet<AnimalTrait> defensiveTraits = new HashSet<>();

    /**
     * Constructor to be called by inheriting classes
     * @param name Name of the animal
     * @param type Type of the animal, can give special effects
     * @param maxHealth The maximum health of the animal
     * @param abilities Abilities the animal is able to use
     */
    protected Animal(String name, AnimalType type, double maxHealth, AnimalAbility... abilities) {
        this.name = name;
        this.type = type;
        this.maxHealth = maxHealth;
        this.health = maxHealth;
        this.abilities = Arrays.asList(abilities);
    }

    /**
     * Get the animal's name
     * @return the animal's name
     */
    public String getName() {
        return name;
    }

    /**
     * Get the animal's type
     * @return the animal's type
     */
    public AnimalType getType() {
        return type;
    }

    /**
     * Get a list of all abilities usable by the animal
     * @return a list of the animal's abilities
     */
    public List<AnimalAbility> getAbilities() {
        return abilities;
    }

    /**
     * Get the animal's max health
     * @return the animal's max health
     */
    public double getMaxHealth() {
        return maxHealth;
    }

    /**
     * Get the animal's current health
     * @return the animal's current health
     */
    public double getHealth() {
        return health;
    }

    /**
     * Add a number of offensive traits. These are modifiers to <b>outgoing</b> damage
     * @param traits Any number of traits to add
     */
    protected void addOffensiveTraits(AnimalTrait... traits) {
        offensiveTraits.addAll(Arrays.asList(traits));
    }

    /**
     * Add a number of defensive traits. These are modifiers to <b>incoming</b> damage
     * @param traits Any number of traits to add
     */
    protected void addDefensiveTraits(AnimalTrait... traits) {
        defensiveTraits.addAll(Arrays.asList(traits));
    }

    /**
     * Causes the animal to take damage
     * @param damage Amount of damage to take
     * @param applyTraits Whether to apply defensive modifiers
     * @return The animal's remaining health
     */
    public double takeDamage(double damage, boolean applyTraits) {
        if (applyTraits) {
            for (AnimalTrait trait : defensiveTraits) {
                damage = damage * trait.damageModifier();
            }
        }
        health = health - damage;
        if (health < 0) {
            onDefeat();
        }
        return health;
    }

    /**
     * Causes the animal to take damage, applying defensive traits by default
     * @param damage Amount of damage to take
     * @return The animal's remaining health
     */
    public double takeDamage(double damage) {
        return this.takeDamage(damage, true);
    }

    /**
     * Called when an animal is defeated, can contain cleanup code. Not implemented yet
     */
    protected void onDefeat() {}

    @Override
    public String toString() {
        return this.getClass().getSimpleName() +  "{" +
                "name='" + name + '\'' +
                ", type=" + type +
                ", abilities=" + abilities +
                ", maxHealth=" + maxHealth +
                ", health=" + health +
                '}';
    }
}
