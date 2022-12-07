package com.example.cvv2.repository;

import com.example.cvv2.model.Cv;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CvRepository extends JpaRepository<Cv, Integer> {
}
