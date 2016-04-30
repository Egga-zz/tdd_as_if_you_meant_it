package de.egga;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import static java.util.Arrays.asList;
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

    private int countLiving(List<String> cells) {
        Predicate<String> isAlive = c -> c.equals(ALIVE);
        return (int) cells.stream().filter(isAlive).count();
    }

    private static final String anyCell = "cell is irrelevant";

    @Test
    public void leftUpperCellWith2AliveNeighboursHasCount2() {
        List<String> neighbors = asList(ALIVE, ALIVE, DEAD);

        int numberOfLivingNeighbors = countLiving(neighbors);

        assertThat(numberOfLivingNeighbors).isEqualTo(2);
    }

    @Test
    public void leftUpperCellWith3AliveNeighboursHasCount3() {
        List<String> neighbors = asList(ALIVE, ALIVE, ALIVE);

        int numberOfLivingNeighbors = countLiving(neighbors);

        assertThat(numberOfLivingNeighbors).isEqualTo(3);
    }

    @Test
    public void leftUpperCellHas3Neighbours() {
        String cell01 = anyCell;
        String cell10 = anyCell;
        String cell11 = anyCell;

        List<String> neighbours = Arrays.asList(cell01, cell10, cell11);

        assertThat(cell01).isIn(neighbours);
        assertThat(cell10).isIn(neighbours);
        assertThat(cell11).isIn(neighbours);
    }
}