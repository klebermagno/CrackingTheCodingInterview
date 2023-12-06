package com.klebermagno.code.advanced.parking;

import java.io.*;
import java.util.*;

/*
* Goals: Design a parking lot using object-oriented principles
* 
* Here are a few methods that you should be able to run:
* 
* Tell us how many spots are remaining
* Tell us how many total spots are in the parking lot
* Tell us when the parking lot is full
* Tell us when the parking lot is empty
* Tell us when certain spots are full e.g. when all motorcycle spots are taken
* Tell us how many spots vans are taking up
* 
* Assumptions:
* 
* The parking lot can hold motorcycles, cars and vans
* The parking lot has motorcycle spots, car spots and large spots
* A motorcycle can park in any spot
* A car can park in a single compact spot, or a regular spot
* A van can park, but it will take up 3 regular spots
* These are just a few assumptions. Feel free to ask your interviewer about more assumptions as needed
* 
 */

class Solution {
  public static void main(String[] args) {
    Veicle car01 = new Veicle(veicleType.car, "01");
    Veicle car02 = new Veicle(veicleType.car, "02");
    Veicle car03 = new Veicle(veicleType.car, "03");

    Parking park = new Parking(1,2,0);
    park.park(car01);

    Integer actualSpot = park.howManyCarSpotRemain();
    assertEquals(actualSpot, Integer.valueOf(1));
 
    park.park(car02);
    actualSpot = park.howManyCarSpotRemain();
    assertEquals(actualSpot, Integer.valueOf(0));

    park.park(car03);
    actualSpot = park.howManyCarSpotRemain();
    assertEquals(actualSpot, Integer.valueOf(0));
  }

 public static void assertEquals(Object actual, Object expected) {
  if (expected.equals(actual)){
    System.out.println("Test Passed!");
  } else {
    System.out.printf("Test Fail: %s aren't equals to expected %s", actual, expected);
  }
 }
}

class Parking{
  
  private int motoSpotSize;
  private int carSpotSize;
  private int largeSpotSize;

  HashMap<String,Veicle> veicles = new HashMap<String,Veicle>();


  Parking(int motoSpotSize, int carSpotSize, int largeSpotSize){
    this.motoSpotSize = motoSpotSize;
    this.carSpotSize = carSpotSize;
    this.largeSpotSize = largeSpotSize;
  }
  
  public int howManyMotoSpotRemain(){
    return motoSpotSize;
  }

  public int howManyCarSpotRemain(){
    return carSpotSize;
  }
  public int howManyLargeSpotRemain(){
    return largeSpotSize;
  }

  public int howManySpotRemain(){
    return motoSpotSize + carSpotSize + largeSpotSize;
  }
  public void park(Veicle veicle) {

    switch(veicle.type) {
      case car: 
        parkCar(veicle);
        break;
      case motorcycle: 
        parkMoto(veicle);
        break;
      case van:
        parkVan(veicle);
        break;
    }
    if (howManySpotRemain() == 0) {
      System.out.println("The Parging is full");
    }
  }

  private void parkCar(Veicle veicle){
    if (carSpotSize >= 1) {
      carSpotSize --;
      veicles.put(veicle.plate, veicle);
    } else if (largeSpotSize >= 1) {
      largeSpotSize --;
      veicles.put(veicle.plate, veicle);
    } else {
      throw new RuntimeException("No more space!");
    }
  }
  private void parkMoto(Veicle veicle){
    if(motoSpotSize >=1){
      motoSpotSize --;
      veicles.put(veicle.plate, veicle);
    } else if (carSpotSize >= 1) {
      carSpotSize --;
      veicles.put(veicle.plate, veicle);
    } else if (largeSpotSize >= 1) {
      largeSpotSize --;
      veicles.put(veicle.plate, veicle);
    } else {
      throw new RuntimeException("No more space!");
    }
      
  }
  private void parkVan(Veicle veicle){
    if (largeSpotSize >= 1) {
      largeSpotSize = largeSpotSize -3;
      veicles.put(veicle.plate, veicle);
    } else {
      throw new RuntimeException("No more space!");
    }
  }
}

class Veicle{
  veicleType type;
  String plate;

  Veicle(veicleType type, String plate){
    this.plate = plate;
    this.type = type;
  }
}

enum veicleType{
  car, motorcycle, van;
}

enum spotType{
  motoSpot, carSpot, largeSpot;
}