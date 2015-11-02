package de.egga.mock;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class ThingTestMockito {

    @Mock
    MessageQueue messageQueue;

    @InjectMocks
    Application application;

    @Test
    public void it_should_collaborate() {
        when(messageQueue.receive()).thenReturn("Fetched value");
        String fetched = application.receive();
        assertThat(fetched).isEqualTo("Fetched value");
    }

    @Test
    public void it_should_verify() {
        application.send("some value");
        verify(messageQueue).send("some value");
    }
}