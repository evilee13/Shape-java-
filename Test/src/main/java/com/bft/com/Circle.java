package com.bft.com;

public class Circle implements Shape {

    final double Pi = 3.1415;
    int radius;

    public Circle(int radius){
        this.radius=radius;
    }
    public double calculateSquare() {
        return Pi*(radius*radius);
    }
}
