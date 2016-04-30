package de.egga;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ThingTestAssertJ {

    public static final String DEAD = "dead";
    public static final String ALIVE = "alive";

    private String livingCellWillBe(int numberOfNeighbors) {
        return numberOfNeighbors <= 1 || numberOfNeighbors >= 4 ? DEAD : ALIVE;
    }

    // just create it in the same way, so we end up
    private String deadCellWillBe(int numberOfNeighbors) {
        return numberOfNeighbors == 3 ? ALIVE : DEAD;
    }

    @Test
    public void cell_should_die_with_no_neighbors() {
        int numberOfNeighbors = 0;
        String newState = livingCellWillBe(numberOfNeighbors);
        assertThat(newState).isEqualTo(DEAD);
    }

    @Test
    public void cell_should_die_with_only_one_neighbor() {
        int numberOfNeighbors = 1;
        String newState = livingCellWillBe(numberOfNeighbors);
        assertThat(newState).isEqualTo(DEAD);
    }

    @Test
    public void cell_should_die_with_four_neighbors() {
        int numberOfNeighbors = 4;
        String newState = livingCellWillBe(numberOfNeighbors);
        assertThat(newState).isEqualTo(DEAD);
    }

    @Test
    public void cell_should_die_with_five_neighbors() {
        int numberOfNeighbors = 5;
        String newState = livingCellWillBe(numberOfNeighbors);
        assertThat(newState).isEqualTo(DEAD);
    }

    @Test
    public void cell_should_live_with_two_neighbors() {
        int numberOfNeighbors = 2;
        String newState = livingCellWillBe(numberOfNeighbors);
        assertThat(newState).isEqualTo(ALIVE);
    }

    @Test
    public void cell_should_live_with_three_neighbors() {
        int numberOfNeighbors = 3;
        String newState = livingCellWillBe(numberOfNeighbors);
        assertThat(newState).isEqualTo(ALIVE);
    }

    @Test
    public void dead_cell_should_live_with_three_neighbors() {
        int numberOfNeighbors = 3;
        String newState = deadCellWillBe(numberOfNeighbors);
        assertThat(newState).isEqualTo(ALIVE);
    }

    //---------------- counting neighbours

    @Test
    public void leftUpperCellWith2AliveNeighboursHasCount2() {
        String cellAt01 = ALIVE;
        String cellAt10 = ALIVE;
        String cellAt11 = DEAD;

        int neighboursOf00 = 0;
        if (cellAt01 == ALIVE) neighboursOf00++;
        if (cellAt10 == ALIVE) neighboursOf00++;
        if (cellAt11 == ALIVE) neighboursOf00++;

        assertThat(neighboursOf00).isEqualTo(2);
    }
}