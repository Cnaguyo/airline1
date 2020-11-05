package com.catherine.Airline.controllers;

import com.catherine.Airline.model.AirCraft;
import com.catherine.Airline.repository.AirCraftRepository;
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
@RequestMapping("api/airCraft")
public class AirCraftController {

  @Autowired
  private AirCraftRepository airCraftRepository;


  public List<AirCraft> getAirCrafts () {
    return airCraftRepository.findAll();
  }

  @PostMapping
  public  void addAirCraft (@RequestBody AirCraft airCraft) {
    airCraftRepository.save(airCraft);
  }

  public void deleteAirCrafts(@PathVariable Long id) {
    airCraftRepository.deleteById(id);
  }
  
}
