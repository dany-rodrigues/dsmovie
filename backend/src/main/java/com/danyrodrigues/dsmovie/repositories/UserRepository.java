package com.danyrodrigues.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.danyrodrigues.dsmovie.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByEmail(String email);
	
}
