package ru.dataart.academy.java.figures;

public class Calculator {
    public double calculateSumOfAreas(Figure[] arrayOfFigures) {
        double result = 0.0;
        for (Figure figure : arrayOfFigures) {
            result += figure.calculateArea();
        }
        return result;
    }

    public double calculateSumOfPerimeters(Figure[] arrayOfFigures) {
        double result = 0.0;
        for (Figure figure : arrayOfFigures) {
            result += figure.calculatePerimeter();
        }
        return result;
    }
}
