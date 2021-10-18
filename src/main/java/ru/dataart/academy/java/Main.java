package ru.dataart.academy.java;

import ru.dataart.academy.java.figures.*;


public class Main {
    public static void main(String[] args) {
        Figure[] arrayOfFigures = {new Circle(10), new Rectangle(10, 20)};
        Calculator calculator = new Calculator();
        System.out.printf("Summary area: %s\nSummary perimeter: %s", calculator.calculateSumOfAreas(arrayOfFigures), calculator.calculateSumOfPerimeters(arrayOfFigures));
    }
}