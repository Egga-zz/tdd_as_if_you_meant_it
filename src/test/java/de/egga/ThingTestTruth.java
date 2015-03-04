package de.egga;

import org.junit.Test;

import static com.google.common.truth.Truth.assertThat;

/**
 * @author egga
 */
public class ThingTestTruth {

    @Test
    public void it_should_call_for_action() {
        Thing thing = new Thing();
        String value = thing.callForAction();
        assertThat(value).isEqualTo("Done.");
    }
}
