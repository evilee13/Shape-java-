package com.bft.com;
public class Triangle implements Shape {
    int length1;
    int length2;
    int length3;

    public Triangle(int length1, int length2,int length3){
        this.length1=length1;
        this.length2=length2;
        this.length3=length3;
    }
    public double calculateSquare() {
        double p=(length1+length2+length3)/2;
        double s=p*(p-length1)*(p-length2)*(p-length3);
        double result = Math.sqrt(s);
        return result;
    }
}
