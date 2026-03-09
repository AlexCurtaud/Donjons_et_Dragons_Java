package Gameplay;

public class Cell {
    private int id;
    private Ennemy ennemy;
    private MysteryBox mysteryBox = null;

    public Cell(int id, Ennemy ennemy, MysteryBox mysteryBox) {
        this.id = id;
        this.ennemy = ennemy;
        this.mysteryBox = mysteryBox;
    }

    // GETTER
    /**
     * Get Cell id
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * Get Cell Ennemy
     * @return ennemy
     */
    public Ennemy getEnnemy() {
        return ennemy;
    }

    /**
     * Get Cell MysteryBox
     * @return mysteryBox
     */
    public MysteryBox getMysteryBox() {
        return mysteryBox;
    }
}
