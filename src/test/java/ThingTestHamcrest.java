import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;


public class ThingTestHamcrest {

    @Test
    public void itName() {
        Thing thing = new Thing();
        String value = thing.callForAction();
        assertThat(value, is(equalTo("Done.")));
    }
}