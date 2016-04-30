package de.egga;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ThingTestAssertJ {

    public static final String DEAD = "dead";
    public static final String ALIVE = "alive";

    private String livingCellWillBe(int numberOfNeighbors) {
        return numberOfNeighbors <= 1 || numberOfNeighbors >= 4 ? DEAD : ALIVE;
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
}