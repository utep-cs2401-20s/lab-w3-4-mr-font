//I'm so lost about what I'm supposed to do

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameOfLifeTest {

    @Test
    void gameOfLife() {
    }

    @Test
    void getBoard() {
    }

    @Test
    void oneStep() {
    }

    @Test
    void neighbors() {
    }

    @Test
    void evolution() {
    }

    @Test
    void setSize() {
    }

    @Test
    void setBoard() {
    }



    //attempt to reimplement evolution2
    @Test
    public void evolution3() {

        int[][] A = {{0,0,0},
                     {0,1,0},
                     {0,0,0}};
        GameOfLife x = new GameOfLife(A);
        int[][] B = {{0,0,0},
                     {0,0,0},
                     {0,0,0}};

        x.evolution(1);

        //assertEquals(B, x.GameOfLife(A));
        assertArrayEquals(B, x.getBoard());
    }

    @Test
    void testGetBoard() {
    }

    @Test
    void testOneStep() {
    }

    @Test
    void testNeighbors() {
    }

    @Test
    void testEvolution() {
    }
}