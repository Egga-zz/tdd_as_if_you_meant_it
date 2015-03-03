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
    public void itName() {
        when(thing.callForAction()).thenReturn("Failed.");
        thing.callForAction();
        verify(thing).callForAction();
    }
}