package com.interview;

import com.interview.player.MultiPlayerState;
import com.interview.player.SinglePlayerState;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    TicTacToe ticTacToe = init();

        while(!ticTacToe.getBoard().isFinished()) {
            ticTacToe.step();
        }

        if(ticTacToe.getBoard().getWinner() > -1) {
            System.out.println("Winner is " + (ticTacToe.getBoard().getWinner() + 1));
        }
    }

    /**
     * Can be moved to TicTacToe constructor
     */
    private static TicTacToe init() {
        Board board = new Board();

        System.out.println("Single Player? ");

        return new TicTacToe(board, readInt() == 0
                ? new SinglePlayerState(new PlayerPojo(1, board), board)
                : new MultiPlayerState(new PlayerPojo(1, board), new PlayerPojo(0, board)));
    }

    /**
     * readInt / current input can be implemented as a Interface which can be implemented in other formats going forward.
     */
    private static int readInt() {
        Scanner myInput = new Scanner( System.in );
        return myInput.nextInt();
    }
}
