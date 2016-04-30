package de.egga;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ThingTestAssertJ {

    public static final String DEAD = "dead";

    private String newCellStateFor(int numberOfNeighbors) {
        return numberOfNeighbors == 1 || numberOfNeighbors == 2 ? DEAD : null;
    }

    @Test
    public void cell_should_die_with_only_one_neighbor() {
        int numberOfNeighbors = 1;
        String newState = newCellStateFor(numberOfNeighbors);
        assertThat(newState).isEqualTo(DEAD);
    }

    @Test
    public void cell_should_die_with_only_two_neighbors() {
        int numberOfNeighbors = 2;
        String newState = newCellStateFor(numberOfNeighbors);
        assertThat(newState).isEqualTo(DEAD);
    }

    @Test
    public void cell_should_live_with_three_neighbors() {
        int numberOfNeighbors = 3;
        String newState = numberOfNeighbors == 3 ? "alive" : null;
        assertThat(newState).isEqualTo("alive");
    }
}