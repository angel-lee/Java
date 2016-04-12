/* Convert pounds to kilograms */

import java.util.Scanner;

public class Exercise2_4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number in pounds: ");
		double pound = input.nextDouble();
		
		double kilogram = pound * 0.454;
		
		System.out.println(pound + " pounds is equal to " + kilogram + " kilograms");
	}
}