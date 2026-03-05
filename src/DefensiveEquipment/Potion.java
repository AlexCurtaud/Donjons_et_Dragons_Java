package DefensiveEquipment;

import java.util.Objects;

public class Potion extends DefensiveEquipment {
    private int power;

    /**
     * Potion is an extension of DefensiveEquipment is herit the name and rarity
     * It also has a power that could be healing or regenerate mana.
     * @param name
     * @param rarity
     * @param type
     * @param power
     */
    public Potion(String name, String rarity, String type, int power) {
        super(name, rarity, type);
        this.power = power;
    }

    // GETTER
    /**
     * Get the power of a potion
     * Could be healing, mana, etc
     * @return power
     */
    public int getPower() {
        return power;
    }

    //toString
    /**
     * Object instance description
     * @return object info
     */
    @Override
    public String toString() {
        String message = "Potion not defined";
        if(Objects.equals(type, "heath")) {
            message = name + "\n[" + type + " Potion] \n" + "Healing +" + power;
        }
        return message;
    }
}
