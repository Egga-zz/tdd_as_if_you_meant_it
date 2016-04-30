package de.egga;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ThingTestAssertJ {

    @Test
    public void it_should_call_for_action() {


        assertThat("Done.").isEqualTo("Done.");
    }
}