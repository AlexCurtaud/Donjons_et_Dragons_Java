package DefensiveEquipment;

public class Potion extends DefensiveEquipment {
    private int heal;
    private String type;

    public Potion(String name, String rarity, int heal, String type) {
        super(name, rarity);
        this.heal = heal;
        this.type = type;
    }

    // GETTER
    public int getHeal() {
        return heal;
    }

    //toString
    @Override
    public String toString() {
        return name + "\n[" + type + " Potion] \n" + "Healing +" + heal;
    }
}
