package com.klebermagno.code.advanced.foreach;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Houses {

    
    public static void main(String[] args) {
        List<House> houses = new ArrayList<House>();
        houses.add(new House("123","Main St."));
        houses.add(new House("111","Main St."));
        houses.add(new House("222","Main St."));
        houses.add(new House("234", "Main Av."));
        houses.add(new House("1000", "Iano"));

        //Method reference:
        houses.forEach(System.out::println);

        //Lambda Expression:
        houses.forEach(house -> System.out.println(house.getStreet()));

        //Consumer:
        Consumer<House> printAddress = new Consumer<House>() {
            public void accept(House house) {
                System.out.println("The address is: " + house);
            };
        };
        houses.forEach(printAddress);
    }

   
}

class House{
        private String number;
        private String street;

        public House(String number, String street){
            this.number = number;
            this.street = street;
        }

        public String getNumber(){return number;}
        public void setNumber(String number) {this.number=number;}

        public String getStreet(){ return this.street;}
        public void setStreet(String street) {this.street = street;}  

        @Override
        public String toString() { return "Street: " + this.street + ", Number: " + this.number;}
}