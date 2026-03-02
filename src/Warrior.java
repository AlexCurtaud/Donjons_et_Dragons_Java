public class Warrior extends Character{
    private final int health = 10;
    private final int physicalAttack = 5;

    // Warrior is extension of the Character Class. A Warrior is a type of Character.
    public Warrior(String characterName, int type) {
        // super is calling to the Character class when creating a Warrior. When we create a Warrior, it creates a Character.
        super(characterName, type);
    }

    // GETTER
    // Get Health
    public int getHealth() {
        return health;
    }

    // Get physical Attack
    public int getPhysicalAttack() {
        return physicalAttack;
    }
}