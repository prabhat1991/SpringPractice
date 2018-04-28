package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.UsersContact;

@Repository
public interface UsersContactRepository extends JpaRepository<UsersContact, Integer> {

}
