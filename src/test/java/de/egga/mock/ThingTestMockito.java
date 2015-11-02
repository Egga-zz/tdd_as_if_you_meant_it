package de.egga.mock;

import de.egga.mock.Repository;
import de.egga.mock.Service;
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
    Repository repository;

    @InjectMocks
    Service service;

    @Test
    public void it_should_collaborate() {
        when(repository.fetch()).thenReturn("Fetched value");
        String fetched = service.fetch();
        assertThat(fetched).isEqualTo("Fetched value");
    }

    @Test
    public void it_should_verify() {
        service.persist("some value");
        verify(repository).persist("some value");
    }
}