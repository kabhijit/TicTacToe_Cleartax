package com.interview;

public class PlayerPojo {
    private int symbol;
    private Board board;
    private int x,y;

    public PlayerPojo(int symbol,
                      Board board) {
        this.symbol = symbol;
        this.board = board;
    }

    public void makeMove(int x, int y) {
        this.board.setMove(x, y, this.symbol);
    }


    public void getManualCoordinate() {
        x = Util.readInt();
        y = Util.readInt();
        makeMove(x, y);
    }

    public void getMachineCoordinate() {
        x = IntelligentMoveGenerator.randomInt();
        y = IntelligentMoveGenerator.randomInt();
        makeMove(x, y);
    }
}
