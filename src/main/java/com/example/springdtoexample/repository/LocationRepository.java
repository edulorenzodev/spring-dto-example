package com.example.springdtoexample.repository;

import com.example.springdtoexample.model.Location;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepository extends JpaRepository<Location, Long> {
}