package com.example.springdtoexample.repository;

import com.example.springdtoexample.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {


}