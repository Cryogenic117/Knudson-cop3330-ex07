package org.example;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int length, width, area;
        double meters;
        double constant = 0.09290304;
        System.out.println("What is the length of the room in feet? ");
        length = input.nextInt();
        System.out.println("What is the width of the room in feet? ");
        width = input.nextInt();

        area = length * width;
        meters = area * constant;

        System.out.printf("The area is %n%d square feet%n%.3f square meters", area, meters);

    }
}
