package de.egga;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class ThingTestMockito {

    @Mock
    private Thing thing;

    @Test
    public void it_should_collaborate() {
        when(thing.callForAction()).thenReturn("Failed.");
        thing.callForAction();
    }

    @Test
    public void it_should_verify() {
        thing.callForAction();
        verify(thing).callForAction();
    }
}