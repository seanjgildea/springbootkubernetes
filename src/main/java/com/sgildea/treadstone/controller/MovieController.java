package com.sgildea.treadstone.controller;

import com.sgildea.treadstone.model.Movie;
import com.sgildea.treadstone.service.MovieService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by sgildea on 12/4/19
 */

@RestController("/movies/v1")
public class MovieController {

    @Autowired
    MovieService movieService;

    @ApiOperation(value="Gets all movies")
    @GetMapping("/all")
    public List<Movie> getAllMovies() {
        return movieService.getAllMovies();
    }

}
