package com.example.cfldata.repositories;

import com.example.cfldata.model.CoinToss;
import com.example.cfldata.model.EventStatus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventStatusRepository extends JpaRepository<EventStatus,Long> {
}
