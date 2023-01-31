package com.example.cfldata.repositories;

import com.example.cfldata.model.GamesResult;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GamesResultRepository extends JpaRepository<GamesResult,Long> {
}
