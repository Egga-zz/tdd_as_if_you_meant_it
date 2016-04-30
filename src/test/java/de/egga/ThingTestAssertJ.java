package de.egga;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ThingTestAssertJ {

    public static final String DEAD = "dead";
    public static final String ALIVE = "alive";

    private String livingCellWillBeDeadWith(int numberOfNeighbors) {
        return numberOfNeighbors == 0 || numberOfNeighbors == 1 ? DEAD : null;
    }

    private String livingCellWillBeAliveWith(int numberOfNeighbors) {
        return numberOfNeighbors == 2 || numberOfNeighbors == 3 ? ALIVE : null;
    }

    @Test
    public void cell_should_die_with_no_neighbors() {
        int numberOfNeighbors = 0;
        String newState = livingCellWillBeDeadWith(numberOfNeighbors);
        assertThat(newState).isEqualTo(DEAD);
    }

    @Test
    public void cell_should_die_with_only_one_neighbor() {
        int numberOfNeighbors = 1;
        String newState = livingCellWillBeDeadWith(numberOfNeighbors);
        assertThat(newState).isEqualTo(DEAD);
    }

    @Test
    public void cell_should_live_with_two_neighbors() {
        int numberOfNeighbors = 2;
        String newState = livingCellWillBeAliveWith(numberOfNeighbors);
        assertThat(newState).isEqualTo(ALIVE);
    }

    @Test
    public void cell_should_live_with_three_neighbors() {
        int numberOfNeighbors = 3;
        String newState = livingCellWillBeAliveWith(numberOfNeighbors);
        assertThat(newState).isEqualTo(ALIVE);
    }
}