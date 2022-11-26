/*
Java Encapsulation
Encapsulation is one of the key features of object-oriented programming. Encapsulation refers to the bundling of fields and methods inside a single class.

It prevents outer classes from accessing and changing fields and methods of a class. This also helps to achieve data hiding.

Problem :Find the area of Rectangle
Simple input: Length -5
              Breadth -6
Simple Output:30              




*/
package com.company;

class Area {

    // fields to calculate area
    int length;
    int breadth;

    // constructor to initialize values
    Area(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // method to calculate area
    public void getArea() {
        int area = length * breadth;
        System.out.println("Area: " + area);
    }
}
public class Find_Area {
    public static void main(String[] args) {

        // create object of Area
        // pass value of length and breadth
        Area rectangle = new Area(5, 6);
        rectangle.getArea();
    }
}
