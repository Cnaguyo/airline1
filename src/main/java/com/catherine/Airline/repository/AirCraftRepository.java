package com.catherine.Airline.repository;

import com.catherine.Airline.model.AirCraft;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AirCraftRepository extends JpaRepository<AirCraft, Long> {

}
