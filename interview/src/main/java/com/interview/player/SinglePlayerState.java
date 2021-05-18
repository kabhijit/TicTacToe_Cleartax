package com.interview.player;

import com.interview.Board;
import com.interview.PlayerPojo;

public class SinglePlayerState implements PlayerState {
    private PlayerPojo player1, player2;
    private boolean isPlayer1;
    private int difficultyLevel;

    public SinglePlayerState(PlayerPojo player, Board board) {
        this.player1 = player;
        this.player2 = new PlayerPojo(0, board);
        this.isPlayer1 = true;
    }

    public void play() {
        if (isPlayer1)
            player1.getManualCoordinate();
        else
            player2.getMachineCoordinate();

        isPlayer1 = !isPlayer1;
    }
}

