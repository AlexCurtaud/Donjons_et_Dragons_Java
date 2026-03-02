public class Wizard extends Character{
    private final int health = 6;
    private final int magicPower = 8;
    private final Gear gear = null;

    // Wizard is extension of the Character Class. A Wizard is a type of Character.
    public Wizard(String characterName, int type) {
        // super is calling to the Character class when creating a Wizard. When we create a wizard, it creates a Character.
        super(characterName, type);
    }

    // GETTER
    // Get Health
    public int getHealth() {
        return health;
    }

    // Get Magic Power
    public int getMagicPower() {
        return magicPower;
    }
}
