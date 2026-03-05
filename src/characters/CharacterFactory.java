package characters;

public class CharacterFactory {
    public static Character characterCreator(String name, String type) {
        Character character;
        if(type == "Wizard") {
            character = new Wizard(name, type);
            System.out.println("Player " + name + ", join the wizard guild");
        } else {
            character = new Warrior(name, type);
            System.out.println("Player " + name + ", join the warrior guild");
        }
        return character;
    }
}
