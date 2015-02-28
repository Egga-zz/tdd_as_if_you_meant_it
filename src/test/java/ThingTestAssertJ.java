import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ThingTestAssertJ {

    @Test
    public void itName() {
        Thing thing = new Thing();
        String value = thing.callForAction();
        assertThat(value).isEqualTo("Done.");
    }
}