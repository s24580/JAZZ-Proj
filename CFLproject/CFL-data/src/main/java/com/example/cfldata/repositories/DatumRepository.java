package com.example.cfldata.repositories;

import com.example.cfldata.model.Datum;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DatumRepository extends JpaRepository<Datum,Long> {
}
