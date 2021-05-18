package com.interview;

public class Board {
    private static int SIZE = 3;

    public Board() {
        this.initialize();
    }

    private void initialize() {
        for(int i = 0; i < SIZE; i++) {
            for(int j = 0; j < SIZE; j++) {
                grid[i][j] = -1;
            }
        }
    }

    private final int[][] grid = new int[SIZE][SIZE];

    public boolean isFinished() {
        return false;
    }

    public int getWinner() {
        return -1;
    }

    private boolean canMakeMove(int i, int j) {
        return grid[i][j] == -1
                && i < SIZE
                && j < SIZE;
    }

    // Need to handle and ask input again from user
    public void setMove(int i, int j, int symbol) throws IllegalArgumentException {
        if(canMakeMove(i, j))
            grid[i][j] = symbol;
        else
            throw new IllegalArgumentException("Bad input");
    }

    public void displayBoard() {
        for(int i = 0; i < SIZE; i++) {
            for(int j = 0; j < SIZE; j++) {
                System.out.print(this.grid()[i][j] + " ");
            }
            System.out.println();
        }
    }

    private int[][] grid() {
        return this.grid;
    }

//    // write a setter method which will write corresponding move, validating stuff like if already set with some value do not write
//    public void setMoveAndDetermineWinner(Player player, int[][] tile) {
//        setMove();
//        // also check if there are any row / column / diagonal which matches the same mark and decllare as winner
//    }
}
