package com.interview.player;

import com.interview.PlayerPojo;

public class MultiPlayerState implements PlayerState {
    private PlayerPojo player1, player2;
    private boolean isPlayer1;
    private int difficultyLevel;

    public MultiPlayerState(PlayerPojo player1,
                            PlayerPojo player2) {
        this.player1 = player1;
        this.player2 = player2;
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