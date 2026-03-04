package OffensiveEquipment;

public class MagicSpell extends OffensiveEquipment {
    private int magicPower;
    private String element;
        public MagicSpell(String name, String rarity, int magicPower, String element) {
            super(name, rarity);
            this.magicPower = magicPower;
            this.element = element;
        }

    // GETTER
    // Get Magic Power
    public int getMagicPower() {
        return magicPower;
    }

    //toString
    public String toString() {
            return name + "\n " + element + " Spell\n" + "Power Boost +" + magicPower;
    }
}
