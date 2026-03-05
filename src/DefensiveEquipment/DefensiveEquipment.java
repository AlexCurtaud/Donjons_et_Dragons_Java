package DefensiveEquipment;

public class DefensiveEquipment {
    protected String name;
    protected String rarity;
    protected String type;

    public DefensiveEquipment(String name, String rarity, String type) {
        this.name = name;
        this.rarity = rarity;
        this.type = type;
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
