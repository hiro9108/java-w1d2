// (Convert Celsius to Fahrenheit) Write a program that reads a Celsius degree in a double value from the console, then converts it to Fahrenheit and displays the result. The formula for the conversion is as follows:
//          fahrenheit = (9 / 5) * celsius + 32
// Hint: In Java, 9 / 5 is 1, but 9.0 / 5 is 1.8.

import java.util.Scanner;

public class ConvertCelToFahrenheit {
    public static void main(String[] args) {
        System.out.println("Write a Celsius degree: ");
        Scanner input = new Scanner(System.in);
        double Fahrenheit = (9.0 / 5.0) * input.nextDouble();
        System.out.println("Fahrenheit is " + Fahrenheit);
    }
}