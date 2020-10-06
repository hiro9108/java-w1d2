// (Financial application: calculate tips) Write a program that reads the subtotal and the gratuity rate, then computes the gratuity and total.
//  For example, if the user enters 10 for subtotal and 15% for gratuity rate, the program displays $1.5 as gratuity and $11.5 as total. 

import java.util.Scanner;

public class FinancialApplication {
    public static void main(String[] args) {
        double RateOfGratuity = 0.15;

        System.out.print("Write your subtotal: ");
        Scanner input = new Scanner(System.in);
        
        // Subtotal
        double subtotal = input.nextDouble();

        // Calculate the gratuity
        double gratuity = RateOfGratuity * subtotal;

        // Total
        double total = gratuity + subtotal;

        // Display
        System.out.println("Gratuity is $" + gratuity);
        System.out.println("Total is $" + total);
    }
}