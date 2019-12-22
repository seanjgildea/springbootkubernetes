package com.sgildea.treadstone.data;

import com.sgildea.treadstone.model.Movie;
import com.sgildea.treadstone.repository.MovieRepository;
import com.sgildea.treadstone.service.MovieService;
import com.sgildea.treadstone.service.impl.MovieServiceImpl;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDate;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
public class MovieServiceIntegrationTest {


    /**
     * To check the service class, we need to have an instance of the class created and available
     * as a @Bean so that we can @Autowire it in our test. This is achieved by @TestConfiguration
     */
    @TestConfiguration
    static class MovieServiceImplTestContextConfiguration {

        @Bean
        public MovieService movieService() {
            return new MovieServiceImpl();
        }
    }


    @Autowired
    private MovieService movieService;

    /**
     * Provides a mock to prevent an actual call to MovieRepository
     */
    @MockBean
    private MovieRepository movieRepository;


    @Before
    public void setUp() {

        Movie movie = new Movie();
        movie.setId(new Long(3));
        movie.setName("Ferris Buellers Day Off");
        movie.setDescription("A high school wise guy is determined to have a day off from school, despite what the Principal thinks of that");
        movie.setReleaseDate(LocalDate.of(1986, 06, 11));

        Mockito.when(movieRepository.findByName(movie.getName()))
                .thenReturn(movie);
    }

    @Test
    public void whenValid_thenMoviesSizeShouldBeGTZero() {

        Movie ferris = movieService.findByName("Ferris Buellers Day Off");

        assertThat(ferris.getName())
                .isEqualTo("Ferris Buellers Day Off");
    }


}
