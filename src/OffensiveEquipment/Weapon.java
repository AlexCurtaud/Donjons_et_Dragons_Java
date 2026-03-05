package OffensiveEquipment;

public class Weapon extends OffensiveEquipment {
    private int physicalAttack;
    private String weaponType;

    /**
     * Weapon Inherit from OffensiveEquipment, it has then a name, rarity and type.
     * It also has a physicalAttack and a weapon type
     * @param name
     * @param rarity
     * @param type
     * @param physicalAttack
     * @param weaponType
     */
    public Weapon(String name, String rarity, String type, int physicalAttack, String weaponType) {
        super(name, rarity, type);
        this.physicalAttack = physicalAttack;
        this.weaponType = weaponType;
    }

    // GETTER

    /**
     * Get the Weapon physicalAttack
     * @return physicalAttack
     */
    public int getPhysicalAttack() {
        return physicalAttack;
    }

    //toString
    /**
     * Weapon Object description
     * @return Weapon info
     */
    public String toString() {
        return name + "\n " + type + "\n" + "Attack Boost +" + physicalAttack;
    }
}
