/* Compute the volume of a cylinder */

import java.util.Scanner;

public class Exercise2_2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the radius of the cylinder: ");
		double radius = input.nextDouble();
		
		System.out.print("Enter the length of the cylinder: ");
		double length = input.nextDouble();
		
		double volume = Math.pow(radius, 2) * Math.PI * length;
		
		System.out.println("The volume of the cylinder is " + volume);
	}
}