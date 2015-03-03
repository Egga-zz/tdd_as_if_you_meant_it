package de.egga;

import com.insightfullogic.lambdabehave.JunitSuiteRunner;
import org.junit.runner.RunWith;

import static com.insightfullogic.lambdabehave.Suite.describe;

/**
 * @author egga
 */
@RunWith(JunitSuiteRunner.class)
public class ThingTestLambdaBehave {
    {

        Thing thing = new Thing();

        describe("a thing", it -> {

            it.should("call for action", expect -> {

                String result = thing.callForAction();

                expect.that(result).isEqualTo("Done.");
            });

        });
    }
}
