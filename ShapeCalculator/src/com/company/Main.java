package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println("Please enter a letter to calculate the area and perimeter of a shape.");

        java.util.Scanner input = new java.util.Scanner(System.in);
        char shape = input.next().charAt(0);

        switch (shape){
            case 'C':
            case 'c':
                System.out.println("Please enter the radius of your circle.");
                double cRadius = input.nextDouble();
                circleCalculator(cRadius);
                break;
            case 'S':
            case 's':
                System.out.println("Please enter one of the sides of your square.");
                double sSideA = input.nextDouble();
                System.out.println("Please enter the other side of your square.");
                double sSideB = input.nextDouble();
                squareCalculator(sSideA, sSideB);
                break;
            case 'R':
            case 'r':
                System.out.println("Please enter one of the sides of your rectangles");
                double rSideA = input.nextDouble();
                System.out.println("Please enter the other side of your rectangle.");
                double rSideB = input.nextDouble();
                rectangleCalculator(rSideA, rSideB);
                break;
            default:
                System.out.println("Invalid shape.");
                System.out.println("Please enter a letter to calculate the area and perimeter of a shape.");
                shape = input.next().charAt(0);
        }

    }

    private static void circleCalculator(double cRadius){

        circleCircumference(cRadius);
        circleArea(cRadius);
    }

    private static void circleCircumference (double cRadius){
        double circumference = 2 * (3.14 * cRadius);
        System.out.println("The circumference is: " + circumference);
    }

    private static void circleArea (double cRadius){
        double area = 2 * (3.14 * Math.pow(cRadius, 2));
        System.out.println("The area is: " + area);
    }

    private static void squareCalculator(double sSideA, double sSideB){
        squarePerimeter(sSideA, sSideB);
        squareArea(sSideA, sSideB);
    }

    private static void squarePerimeter (double sSideA, double sSideB){
        double perimeter = (2 * sSideA) + (2 * sSideB);
        System.out.println("The perimeter is: " + perimeter);
    }

    private static void squareArea (double sSideA, double sSideB){
        double area = sSideA * sSideB;
        System.out.println("The area is: " + area);
    }

    private static void rectangleCalculator(double rSideA, double rSideB){
        rectanglePerimeter(rSideA, rSideB);
        rectangleArea(rSideA, rSideB);
    }

    private static void rectanglePerimeter (double rSideA, double rSideB){
        double perimeter = (2 * rSideA) + (2 * rSideB);
        System.out.println("The perimeter is: " + perimeter);
    }

    private static void rectangleArea (double rSideA, double rSideB){
        double area = rSideA * rSideB;
        System.out.println("The area is: " + area);
    }
}
