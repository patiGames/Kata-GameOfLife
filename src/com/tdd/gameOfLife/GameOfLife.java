package com.tdd.gameOfLife;

public class GameOfLife {

    private int[][] board;

    public  GameOfLife(int[][] board) {
        
        this.board = board;

    }

    public void nextGen() {

        int[][] newBoard = new int [this.board.length][this.board[0].length];

        for(int i = 0, len = this.board.length; i< len; ++i) {
            for(int j = 0, len2 = this.board[i].length; j< len2; ++j) {

                int newCellValue = this.board[i][j];
                int neighbours = getAmountOfNeighbours(i,j);

                if (neighbours < 2) newCellValue = 0;

                if (neighbours > 3) newCellValue = 0;

                if(neighbours == 3) newCellValue = 1;

                newBoard[i][j] = newCellValue;

            }
        }

        this.board = newBoard;

    }

    private int getAmountOfNeighbours(int x, int y) {

        int totalNeighbours = 0;

        totalNeighbours += getValueOf(x-1,y-1);
        totalNeighbours += getValueOf(x,y-1);
        totalNeighbours += getValueOf(x+1,y-1);

        totalNeighbours += getValueOf(x-1,y);
        totalNeighbours += getValueOf(x+1,y);

        totalNeighbours += getValueOf(x-1,y+1);
        totalNeighbours += getValueOf(x,y+1);
        totalNeighbours += getValueOf(x+1,y+1);

        return totalNeighbours;
    }

    private int getValueOf(int x, int y) {
        if(x<0 || y < 0) return 0;
        if(x>=this.board.length || y>= this.board[0].length) return 0;

        return this.board[x][y];
    }

    public int[][] getBoard() {
        return board;
    }
}
