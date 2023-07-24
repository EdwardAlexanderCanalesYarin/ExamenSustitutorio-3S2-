package org.example;

public class TicTacToe {
    private int[][] grid;
    private char turn = 'X';

    public TicTacToe() {
        grid = new int[3][3];
    }

    public int jugar(int row, int column) {
        if (row >= 0 && row < 3 && column >= 0 && column < 3)
            return grid[row][column];
        else
            return -1;
    }
}
