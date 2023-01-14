package com.example.cfldata.repositories;

import com.example.cfldata.model.CoinToss;
import com.example.cfldata.model.Venue;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VenueRepository extends JpaRepository<Venue,Long> {
}
