package OffensiveEquipment;

public class OffensiveEquipment {
    protected String name;
    protected String rarity;

    public OffensiveEquipment(String name, String rarity) {
        this.name = name;
        this.rarity = rarity;
    }

    // GETTER
    // Get name
    public String getName() {
        return name;
    }

    // Get rarity
    public String getRarity() {
        return rarity;
    }
}
