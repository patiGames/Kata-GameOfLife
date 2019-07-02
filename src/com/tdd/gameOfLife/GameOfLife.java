package com.tdd.gameOfLife;

public class GameOfLife {

    private int[][] board;

    public GameOfLife(int[][] board) {
        
        this.board = board;

    }

    public void nextGen() {

        this.board[0][0] = 0;

        for(int i = 0, len = this.board.length; i< len; ++i) {
            for(int j = 0, len2 = this.board[i].length; j< len2; ++j) {

                this.board[i][j] = (this.board[i][j] == 1) ? 0 : this.board[i][j];

            }
        }

    }

    public int[][] getBoard() {
        return board;
    }
}
