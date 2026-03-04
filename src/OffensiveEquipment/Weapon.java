package OffensiveEquipment;

public class Weapon extends OffensiveEquipment {
    private int physicalAttack;
    private String type;

    public Weapon(String name, String rarity, int physicalAttack, String type) {
        super(name, rarity);
        this.physicalAttack = physicalAttack;
        this.type = type;
    }

    // GETTER
    // Get Physical Attack
    public int getPhysicalAttack() {
        return physicalAttack;
    }

    //toString
    public String toString() {
        return name + "\n " + type + "\n" + "Attack Boost +" + physicalAttack;
    }
}
