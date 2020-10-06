// (Find the number of years) Write a program that prompts the user to enter the minutes (e.g., 1 billion),
// and displays the number of years and days for the min- utes. For simplicity, assume a year has 365 days

import java.util.Scanner;

public class FindNumberOfYears {
    public static void main(String[] args) {
        System.out.print("Write the minutes: ");
        Scanner input = new Scanner(System.in);
        long val = input.nextLong();
        
        // Convert to days in minutes
        long days = val / 1440;
        
        // Convert to years in days
        long years = days / 365;

        // Show displays
        System.out.println(years + " years and " + days + " days for " + val + " minutes");
    }
}