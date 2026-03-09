package Gameplay;

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
    public Cell[] initBoard() {
        cells[0] = new Cell[cellNb];

    }


}
