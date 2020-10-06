// (Compute the volume of a cylinder) Write a program that reads in the radius and length of a cylinder and computes the area and volume using the following formulas:
// area = radius * radius * p volume = area * length

import java.util.Scanner;

public class ComputeVolumeOfCylinder {
    public static void main(String[] args) {
        double Pi = 3.14;
        Scanner input = new Scanner(System.in);

        // length and radius values
        System.out.print("Write a length value: ");
        double length = input.nextDouble();

        System.out.print("Write a radius value: ");
        double radius = input.nextDouble();

        // Area value
        double area = radius * radius * Pi;

        // Volume value
        double volume = area * length;

        // Show result of volume
        System.out.println("Volume value is " + volume);
        
    }
}