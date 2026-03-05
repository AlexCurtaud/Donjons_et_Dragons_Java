package OffensiveEquipment;

public class MagicSpell extends OffensiveEquipment {
    private int magicPower;
    private String element;

    /**
     * MagicSpell Inherit from OffensiveEquipment, it has then a name, rarity and type.
     * It also has a magic power and an element
     * @param name
     * @param rarity
     * @param type
     * @param magicPower
     * @param element
     */
    public MagicSpell(String name, String rarity, String type, int magicPower, String element) {
        super(name, rarity, type);
        this.magicPower = magicPower;
        this.element = element;
        }

    // GETTER
    /**
     * Get the MagicSpell's magic power
     * @return magicPower
     */
    public int getMagicPower() {
        return magicPower;
    }

    //toString
    /**
     * MagicSpell Object description
     * @return MagicSpell info
     */
    public String toString() {
            return name + "\n " + element + " Spell\n" + "Power Boost +" + magicPower;
    }
}
