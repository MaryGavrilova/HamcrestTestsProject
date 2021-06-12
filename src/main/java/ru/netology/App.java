package ru.netology;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Расчет площади круга и длины его окружности");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите свое имя:");
        String name = scanner.nextLine();
        System.out.println("Введите радиус окружности в сантиметрах:");
        String input = scanner.nextLine();
        double circleArea = calculateCircleArea(input);
        double circleLength = calculateCircleLength(input);
        String allOperations = addToString(circleArea, circleLength, name);

        System.out.println(allOperations);
    }


    public static String addToString(double circleArea, double circleLength, String name) {
        return "Результаты подсчетов для " + name + ":"
                + " Площадь круга: " + circleArea
                + " Длина окружности: " + circleLength;
    }

    public static double calculateCircleArea(String input) {
        double circleArea = 0;
        try {
            final double pi = 3.14;
            double radius = Double.parseDouble(input);
            if (radius <= 0) return 0;
            circleArea = pi * radius * radius;
            return circleArea;
        } catch (NumberFormatException e) {
            System.out.println("Введено не число");
        }
        return circleArea;
    }

    public static double calculateCircleLength(String input) {
        double circleLength = 0;
        try {
            final double pi = 3.14;
            double radius = Double.parseDouble(input);
            if (radius <= 0) return 0;
            circleLength = 2 * pi * radius;
            return circleLength;
        } catch (NumberFormatException e) {
            System.out.println("Введено не число");
        }
        return circleLength;
    }
}