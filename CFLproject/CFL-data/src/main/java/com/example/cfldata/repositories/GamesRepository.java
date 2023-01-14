package com.example.cfldata.repositories;

import com.example.cfldata.model.Games;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GamesRepository extends JpaRepository<Games,Long> {
}
