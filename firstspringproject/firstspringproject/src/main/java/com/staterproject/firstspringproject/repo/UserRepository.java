package com.staterproject.firstspringproject.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.staterproject.firstspringproject.model.User;


public interface UserRepository extends JpaRepository<User, Integer>  {
         
}