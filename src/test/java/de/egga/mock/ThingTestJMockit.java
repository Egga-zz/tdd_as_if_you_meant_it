package de.egga.mock;

import mockit.Expectations;
import mockit.Mocked;
import mockit.Verifications;
import org.junit.Ignore;
import org.junit.Test;

public class ThingTestJMockit {

    @Mocked
    MessageQueue messageQueue;

    Application application = new Application(messageQueue);

    @Test
    @Ignore
    public void it_should_collaborate() {
        new Expectations() {{
            messageQueue.receive();
            result = "Fake";
        }};
        application.receive();
    }

    @Test
    @Ignore
    public void it_should_verify() {
        application.send("some value");

        new Verifications() {{
            messageQueue.send("some value");
            times = 1;
        }};

    }
}
