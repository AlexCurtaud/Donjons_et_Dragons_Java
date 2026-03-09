package Gameplay;

import DefensiveEquipment.Potion;
import Enemy.Gobelin;
import OffensiveEquipment.Weapon;

import java.util.ArrayList;

public class Board {
    private int cellNb;
    protected ArrayList<Cell> cells;

    /**
     * Board Constructor, for now it is made out of a number of cells
     * @param cellNb
     */
    public Board(int cellNb) {
        this.cellNb = cellNb;
        this.cells = new ArrayList<Cell>();
    }

    // GETTER

    /**
     * Get the cell number of the board
     * @return
     */
    public int getCellNb() {
        return cellNb;
    }

    // Method
    /**
     * Board Initialisation method. It creates a board of Cell as long as its number of cell.
     * It creates a Cell Object has many times as the cellNb attribute of the board.
     * @return board of Cell
     */
    public ArrayList<Cell> initBoard() {
        cells.add(0, new Cell(1, null, null, null));
        cells.add(1, new Cell(2, new Gobelin("Gobelin", 9, "Gobelin"), null, null));
        cells.add(2, new Cell(3, null, new Weapon("Basic Sword", "Common", "Weapon", 5, "Sword"), null));
        cells.add(3, new Cell(4, null, null, new Potion("Standard Potion", "Common", "Health", 2)));
        return cells;
    }


}
