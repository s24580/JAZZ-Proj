package com.example.cfldata.repositories;

import com.example.cfldata.model.CoinToss;
import com.example.cfldata.model.Players;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayersRepository extends JpaRepository<Players,Long> {
}
