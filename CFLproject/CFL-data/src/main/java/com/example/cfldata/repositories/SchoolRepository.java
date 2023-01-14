package com.example.cfldata.repositories;

import com.example.cfldata.model.CoinToss;
import com.example.cfldata.model.School;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SchoolRepository extends JpaRepository<School,Long> {
}
