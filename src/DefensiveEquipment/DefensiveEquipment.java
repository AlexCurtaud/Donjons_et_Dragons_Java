package DefensiveEquipment;

public class DefensiveEquipment {
    protected String name;
    protected String rarity;

    public DefensiveEquipment(String name, String rarity) {
        this.name = name;
        this.rarity = rarity;
    }

    // GETTER
    // Get Name
    public String getName() {
        return name;
    }

    // Get Rarity
    public String getRarity() {
        return rarity;
    }
}
