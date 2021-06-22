package com.bft.com;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class App {
    public static void main(String[] args) {
        Circle circleOne = new Circle(10);
        System.out.println(circleOne.calculateSquare());
        Rectangle rectangleOne = new Rectangle(20, 15);
        System.out.println(rectangleOne.calculateSquare());
        Triangle triangleOne = new Triangle(5, 12, 15);
        System.out.println(triangleOne.calculateSquare());

        ArrayList<Shape> shapeArrayList = (ArrayList<Shape>) fillShapeList();

        Collections.sort(shapeArrayList, new Comparator<Shape>() {
            public int compare(Shape o1, Shape o2) {
                return o1.toString().compareTo(o2.toString());
            }
        });
    }

    public static Shape generateShape() {
        int value = ThreadLocalRandom.current().nextInt(1, 3);
        Shape shape = null;
        switch (value) {
            case 1:
                shape = new Circle(ThreadLocalRandom.current().nextInt(1, 100));
            case 2:
                shape = new Rectangle(ThreadLocalRandom.current().nextInt(1, 100), ThreadLocalRandom.current().nextInt(1, 100));
            case 3:
                shape = new Triangle(ThreadLocalRandom.current().nextInt(1, 100), ThreadLocalRandom.current().nextInt(1, 100), ThreadLocalRandom.current().nextInt(1, 100));
        }
        return shape;
    }

    public static List<Shape> fillShapeList() {
        ArrayList<Shape> shapeArrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            shapeArrayList.add(generateShape());
        }
        return shapeArrayList;
    }

    public static List<Shape> deleteElement() {
        int n = 50;
        ListIterator<Shape> shapeIterator = shapeArrayList.iterator();
        while (shapeIterator.hasNext()) {
            Shape nextShape = shapeIterator.next();
            if (nextShape.calculateSquare() > n) {
                shapeIterator.remove();
            }
        }
    }
}
