package com.labs.java.core;

import java.util.Scanner;

public class CelsiusToFarenheitConverter {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the temperature in Celsius: ");
        double celsius = scanner.nextDouble();
        double faherheit = (celsius * 9 / 5) + 32;
        // 100.0 degree celsius is equal to 212 in Farenheit
        
        System.out.println(celsius + "degree celsius is equal to 212 in Fahrenheit " + faherheit + " in Fahrenheit");
        scanner.close();
    }
}
