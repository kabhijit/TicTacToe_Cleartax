package com.interview;

import com.interview.player.PlayerState;

import java.util.Scanner;

public class TicTacToe {
    private Board board;
    private int currentPlayer = 0;
    private PlayerState playerState;

    // Could have been constructor
    public TicTacToe(Board board, PlayerState playerState) {
        this.board = board;
        this.playerState = playerState;
    }

    public void step() {
        board.displayBoard();
        System.out.println("Move for player " + (currentPlayer + 1));
        playerState.play();
    }

    public Board getBoard() {
        return board;
    }

    private static int readInt() {
        Scanner myInput = new Scanner( System.in );
        return myInput.nextInt();
    }
}
