package characters;

import Gameplay.Dice;

public abstract class Character {
    protected String name;
    protected String type;
    private int currentPosition = 1;

    public Character(String name, String type) {
        this.name = name;
        this.type = type;
    }

    // GETTER
    // Get the character's name
    public String getName() {
        return name;
    }

    // Get the characters' type
    public String getType() {
        return type;
    }

    // Get the character's position
    public int getCurrentPosition() {
        return currentPosition;
    }

    // Get stats from the character
    // Attack
    public abstract int getAttackStat();
    // Defense
    public abstract int getHealthStat();

    // SETTER
    // Set Current Position
    public void setCurrentPosition(int i){
        currentPosition = i;
    }

    // Method
    // Character's move
    public void move(Dice dice) {
        currentPosition += dice.getScore();
    }


}
