package animals;

/**
 * Describes an ability usable by an animal
 */
public class AnimalAbility {
    private String name;
    private String description;
    private double baseDamage;

    /**
     * Create a new ability
     * @param name The abilities name
     * @param description The abilities description
     * @param baseDamage The abilities base damage
     */
    public AnimalAbility(String name, String description, double baseDamage) {
        this.name = name;
        this.description = description;
        this.baseDamage = baseDamage;
    }

    /**
     * Get the abilities name
     * @return the abilities name
     */
    public String getName() {
        return name;
    }

    /**
     * Get the abilities description
     * @return the abilities description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Get the abilities base damage
     * @return the abilities base damage
     */
    public double getBaseDamage() {
        return baseDamage;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{" + "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", baseDamage=" + baseDamage +
                '}';
    }
}
