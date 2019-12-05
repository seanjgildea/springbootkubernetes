package com.sgildea.treadstone.service.impl;

import com.sgildea.treadstone.model.Movie;
import com.sgildea.treadstone.repository.MovieRepository;
import com.sgildea.treadstone.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by sgildea on 12/4/19
 */
@Service
public class MovieServiceImpl implements MovieService {

    @Autowired
    private MovieRepository movieRepository;

    @Override
    public List<Movie> getAllMovies() {
        return (List<Movie>)movieRepository.findAll();
    }
}
