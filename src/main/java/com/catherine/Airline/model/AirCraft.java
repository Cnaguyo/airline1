package com.catherine.Airline.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.print.attribute.standard.Destination;

@Entity
public class AirCraft {
@Id
@GeneratedValue
  private long Id;
  private  boolean isCurrentlyFlying;
  private String AirCraftNumber;
  private Integer numOfFleets;
  private Destination destination;
  private final double fuelTons = 5;
  private final double TonCosts = 2;


  public long getId() {
    return Id;
  }

  public void setId(long id) {
    Id = id;
  }

  public boolean isCurrentlyFlying() {
    return isCurrentlyFlying;
  }

  public void setCurrentlyFlying(boolean currentlyFlying) {
    isCurrentlyFlying = currentlyFlying;
  }

  public String getAirCraftNumber() {
    return AirCraftNumber;
  }

  public void setAirCraftNumber(String airCraftNumber) {
    AirCraftNumber = airCraftNumber;
  }

  public Integer getNumOfFleets() {
    return numOfFleets;
  }

  public void setNumOfFleets(Integer numOfFleets) {
    this.numOfFleets = numOfFleets;
  }

  public Destination getDestination() {
    return destination;
  }

  public void setDestination(Destination destination) {
    this.destination = destination;
  }

  public double getFuelTons() {
    return fuelTons;
  }

  public double getTonCosts() {
    return TonCosts;
  }
}
