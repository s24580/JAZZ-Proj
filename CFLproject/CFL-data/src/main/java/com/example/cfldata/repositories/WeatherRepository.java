package com.example.cfldata.repositories;

import com.example.cfldata.model.CoinToss;
import com.example.cfldata.model.Weather;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WeatherRepository extends JpaRepository<Weather,Long> {
}
