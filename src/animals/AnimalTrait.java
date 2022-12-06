package animals;

/**
 * Create a new animal trait, usable by {@link Animal#addDefensiveTraits(AnimalTrait...)} and {@link Animal#addOffensiveTraits(AnimalTrait...)}
 * @param description The trait's description
 * @param damageModifier The trait's damage modifier. Passing a value of 1 will cause the modifier to not make any changes
 */
public record AnimalTrait(String description, double damageModifier) {
}
