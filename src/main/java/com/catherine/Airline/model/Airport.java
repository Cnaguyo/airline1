package com.catherine.Airline.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.time.LocalDateTime;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Airport {
  @Id
  @GeneratedValue
  private Long id;
  private String name;
  @JsonFormat(pattern = "dd-MM-yyyy")
  private LocalDateTime departureTime;
  @JsonFormat(pattern = "dd-MM-yyyy")
  private LocalDateTime arrivalTime;
  private Integer numOfAirCrafts;

  @ManyToOne
  private AirCraft airCraft;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public LocalDateTime getDepartureTime() {
    return departureTime;
  }

  public void setDepartureTime(LocalDateTime departureTime) {
    this.departureTime = departureTime;
  }

  public LocalDateTime getArrivalTime() {
    return arrivalTime;
  }

  public void setArrivalTime(LocalDateTime arrivalTime) {
    this.arrivalTime = arrivalTime;
  }

  public Integer getNumOfAirCrafts() {
    return numOfAirCrafts;
  }

  public void setNumOfAirCrafts(Integer numOfAirCrafts) {
    this.numOfAirCrafts = numOfAirCrafts;
  }

  public AirCraft getAirCraft() {
    return airCraft;
  }

  public void setAirCraft(AirCraft airCraft) {
    this.airCraft = airCraft;
  }
}
