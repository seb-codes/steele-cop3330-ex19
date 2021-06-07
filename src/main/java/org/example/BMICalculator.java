/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Sebastian Steele
 */
package org.example;

import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        String msg = " ";
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your height in inches: ");
        Double height = scan.nextDouble();
        System.out.print("Enter your weight in pounds: ");
        Double weight = scan.nextDouble();

        Double bmi = (weight / (height * height)) * 703;

        System.out.println(String.format("Your BMI is %.02f",bmi));

        if((bmi>=18.5) && (bmi<=25))
            msg = "You are within the ideal weight range.";
        else
            msg = "You are overweight. You should see your doctor.";

        System.out.println(msg);

    }
}
