package DefensiveEquipment;

public class Shield extends DefensiveEquipment{
    private int defense;

    /**
     * Shield inherits from DefensiveEquipment's attributes name, rarity and type.
     * It also has a defense attribute that is specific to the Shield
     * @param name
     * @param rarity
     * @param type
     * @param defense
     */
    public Shield(String name, String rarity, String type, int defense) {
        super(name, rarity, type);
        this.defense = defense;
    }

    //GETTER

    /**
     * Get the Defense bonus stat from the shield
     * @return defense
     */
    public int getDefense() {
        return defense;
    }

    /**
     * A description from the Shield object
     * @return Shield description
     */
    @Override
    public String toString() {
        return name + "\n Type: Shield \n Rarity: " + rarity + "\n Defense + " + defense;
    }
}
