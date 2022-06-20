package com.klebermagno.code.advanced.method_references;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args){

        Square square = new Square(2);


        Shapes shape = (Square sq)->{
            return sq.calculateArea();
        };
        Shapes shape2 = Square::calculateArea;

        System.out.println("Method 1: "+ shape.getArea(square));
        System.out.println("Method 2: " + shape2.getArea(square));
    }
}

@FunctionalInterface
interface Shapes{

    public abstract int getArea(Square person);
}

class Square {

    int sideLength;

    public Square(int sideLength){
        this.sideLength = sideLength;
    }
    public int calculateArea(){
        return this.sideLength * this.sideLength;
    }
}