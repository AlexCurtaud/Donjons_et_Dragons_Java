package Gameplay;

import DefensiveEquipment.DefensiveEquipment;
import Enemy.Enemy;
import OffensiveEquipment.OffensiveEquipment;
import Characters.Character;

public class Cell {
    private int id;
    private Character player = null;
    private Enemy enemy;
    private OffensiveEquipment offEquip = null;
    private DefensiveEquipment defEquip = null;
//    private MysteryBox mysteryBox = null;

    /**
     * Cell Class and Constructor are made to create instance of a Board Cell. In a boardgame, there is a number of Cells and each cell has a content.
     * Here a cell must have an id, and it can have a Enemy, an OffensiveEquipment and a DefensiveEquipement
     *
     * @param id
     * @param enemy
     * @param offEquip
     * @param defEquip
     */
    public Cell(int id, Enemy enemy, OffensiveEquipment offEquip, DefensiveEquipment defEquip) {
        this.id = id;
        this.enemy = enemy;
        this.offEquip = offEquip;
        this.defEquip = defEquip;
//        this.mysteryBox = mysteryBox;
    }

    // GETTER

    /**
     * Get Cell id
     *
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * Get the Cell Character
     *
     * @return Character
     */
    public Character getPlayer() {
        return player;
    }

    /**
     * Get Cell Enemy
     *
     * @return enemy
     */
    public Enemy getEnemy() {
        return enemy;
    }

    /**
     * Get the Cell OffensiveEquipment
     *
     * @return OffensiveEquipement
     */
    public OffensiveEquipment getOffEquip() {
        return offEquip;
    }

    /**
     * Get the Cell DefensiveEquipment
     *
     * @return DefensiveEquipement
     */
    public DefensiveEquipment getDefEquip() {
        return defEquip;
    }

    /**
     * Get Cell MysteryBox
     *
     * @return mysteryBox
     */

//    public MysteryBox getMysteryBox() {
//        return mysteryBox;
//    }

    //SETTER
    public void setPlayer(Character player) {
        if (player.getCurrentPosition() == this.id) {
            this.player = player;
        }
        player = null;
    }

    //toString
    @Override
    public String toString() {
        String sentence = "Empty Cell";
        if (enemy != null) {
            sentence = "\nCell " + this.getId() + "\nYou encounter: " + enemy.toString();
        }
        if (offEquip != null) {
                sentence = "\nCell " + this.getId() + "\nYou found: " + offEquip.toString();
            }
        if (defEquip != null) {
                sentence = "\nCell " + this.getId() + "\nYou found: " + defEquip.toString();
        }
        return sentence;
        }
    }

