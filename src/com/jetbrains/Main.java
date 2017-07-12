package com.jetbrains;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double userLength = 0.0;
        double userWidth = 0.0;
        double roomArea = 0.0;
        double roomPerimeter = 0.0;
        String answer = "";

        Scanner scnr = new Scanner(System.in);

        do {

            System.out.println("Please enter length: ");

            userLength = scnr.nextDouble();
            scnr.nextLine();

            System.out.println("Please enter width: ");

            userWidth = scnr.nextDouble();
            scnr.nextLine();

            roomArea = userLength * userWidth;

            System.out.println("The area is: " + roomArea);

            roomPerimeter = 2 * (userLength + userWidth);

            System.out.println("The perimeter is: " + roomPerimeter);

            System.out.println("Press Y to contine or N to exit");

            answer = scnr.next();

        } while (answer.equals("Y"));

        return;
    }
}
