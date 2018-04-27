package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.example.demo.models.Users;

/**
 * Create an interface and extend JpaRepository.
 * The basic CRUD functionality gets implemented by the Repository internally.
 * @author prabhatkumar
 *
 */
@Component
public interface UserJpaRepository extends JpaRepository<Users, Long> {

	/**
	 * A custom method declaration
	 * JpaRepository itself creates a query internally which search the Users table with name as filter
	 * select * from Users where name = name
	 * @param name
	 * @return
	 */
	List<Users> findByName(String name);

}
