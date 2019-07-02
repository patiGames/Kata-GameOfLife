package com.tdd.gameOfLife;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GameOfLifeShould {

    @Test
    public void one_cell_should_die() {

        int [][] grid = {{1}};

        GameOfLife gameOfLife = new GameOfLife(grid);
        gameOfLife.nextGen();

        int [][] expectedGrid = {{0}};

        Assertions.assertArrayEquals(expectedGrid,
               gameOfLife.getBoard());
    }

    @Test
    public void center_cell_should_die() {

        int [][] grid =
                {
                        {0,0,0},
                        {0,1,0},
                        {0,0,0}
                };

        GameOfLife gameOfLife = new GameOfLife(grid);
        gameOfLife.nextGen();

        int [][] expectedGrid =
                {
                        {0,0,0},
                        {0,0,0},
                        {0,0,0}
                };


        Assertions.assertArrayEquals(expectedGrid,
                gameOfLife.getBoard());
    }

    @Test
    public void cell_with_2_neighbours() {

        int [][] grid =
                {
                        {1,1,1},
                        {0,0,0},
                        {0,0,0}
                };

        GameOfLife gameOfLife = new GameOfLife(grid);
        gameOfLife.nextGen();

        int [][] expectedGrid =
                {
                        {0,1,0},
                        {0,0,0},
                        {0,0,0}
                };


        Assertions.assertArrayEquals(expectedGrid,
                gameOfLife.getBoard());
    }

    @Test
    public void cell_with_more_than_3_neighbours_dies() {

        int [][] grid =
                {
                        {1,1,1},
                        {1,0,0},
                        {1,1,0}
                };

        GameOfLife gameOfLife = new GameOfLife(grid);
        gameOfLife.nextGen();

        int [][] expectedGrid =
                {
                        {1,1,0},
                        {0,0,0},
                        {1,1,0}
                };


        Assertions.assertArrayEquals(expectedGrid,
                gameOfLife.getBoard());
    }
}
