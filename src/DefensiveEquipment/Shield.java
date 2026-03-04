package DefensiveEquipment;

public class Shield extends DefensiveEquipment{
    private int defense;

    public Shield(String name, String rarity, int defense) {
        super(name, rarity);
        this.defense = defense;
    }

    //GETTER
    // Get defense
    public int getDefense() {
        return defense;
    }

    @Override
    public String toString() {
        return name + "\n Type: Shield \n Rarity: " + rarity + "\n Defense + " + defense;
    }
}
