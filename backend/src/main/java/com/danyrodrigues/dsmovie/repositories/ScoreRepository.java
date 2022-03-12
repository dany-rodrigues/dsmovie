package com.danyrodrigues.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.danyrodrigues.dsmovie.entities.Score;
import com.danyrodrigues.dsmovie.entities.ScorePk;


public interface ScoreRepository extends JpaRepository<Score, ScorePk> {

}
