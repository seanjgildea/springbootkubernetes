package com.sgildea.treadstone.repository;

import com.sgildea.treadstone.model.Movie;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by sgildea on 12/4/19
 */
@Repository
public interface MovieRepository extends CrudRepository<Movie, Long> {

    public Movie findByName(String name);
}
