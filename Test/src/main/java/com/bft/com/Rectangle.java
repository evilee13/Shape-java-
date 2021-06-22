package com.bft.com;

public class Rectangle implements Shape {
        int length;
        int width;

    public Rectangle(int length, int width){
            this.length=length;
            this.width=width;
        }
        public double calculateSquare() {
            return length*width;
        }
}
