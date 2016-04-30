package de.egga;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ThingTestAssertJ {

    @Test
    public void cell_should_die_with_only_one_neighbor() {
        int numberOfNeighbors = 1;
        String newState = numberOfNeighbors == 1 ? "dead" : null;
        assertThat(newState).isEqualTo("dead");
    }

    @Test
    public void cell_should_die_with_only_two_neighbors() {
        int numberOfNeighbors = 2;
        String newState = numberOfNeighbors == 2 ? "dead" : null;
        assertThat(newState).isEqualTo("dead");
    }
}