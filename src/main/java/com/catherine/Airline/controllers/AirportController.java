package com.catherine.Airline.controllers;

import com.catherine.Airline.model.Airport;
import com.catherine.Airline.repository.AirportRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/airport")
public class AirportController {

  @Autowired
  private AirportRepository airportRepository;

@GetMapping
  public List<Airport> getAirports(){
    return airportRepository.findAll();
  }

  @PostMapping
  public void addAirport(@RequestBody Airport airport) {
    airportRepository.save(airport);
  }
  @DeleteMapping
  public void deleteAirport(@PathVariable Long id) {
  airportRepository.deleteById(id);
  }

}
