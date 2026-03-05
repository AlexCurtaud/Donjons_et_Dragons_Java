package OffensiveEquipment;

public abstract class OffensiveEquipment {
    protected String name;
    protected String rarity;
    protected String type;

    /**
     * Offensive Equipment Class is the mother class of all attack type equipment
     * It has a name, rarity and a type.
     * Many others equipments will inherit this class
     * @param name
     * @param rarity
     * @param type
     */
    public OffensiveEquipment(String name, String rarity, String type) {
        this.name = name;
        this.rarity = rarity;
        this.type = type;
    }

    // GETTER
    /**
     * Get the Offensive Equipment's name
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Get the Offensive Equipment's rarity
     * @return rarity
     */
    public String getRarity() {
        return rarity;
    }

    /**
     * Get the Offensive Equipment's type
     * @return type
     */
    public String getType() {
        return type;
    }


}
