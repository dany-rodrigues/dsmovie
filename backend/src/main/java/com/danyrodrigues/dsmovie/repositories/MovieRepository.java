package com.danyrodrigues.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.danyrodrigues.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {

}
