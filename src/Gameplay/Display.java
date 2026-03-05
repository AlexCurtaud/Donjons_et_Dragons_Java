package Gameplay;

import characters.Character;

public class Display {
    private final String ls;

    public Display() {
        ls = System.lineSeparator();
    }

    //Display Method
    public void statsDisplay(Character player) {
        System.out.println(
                player.getName() + " : " + player.getType() + ls +
                "Health: " + player.getHealthStat() + ls +
                "Attack: " + player.getAttackStat());
    }
}