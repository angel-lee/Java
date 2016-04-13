/* Sum the digits in an integer */

import java.util.Scanner;

public class Exercise2_6 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter an integer between 0 and 1000: ");
		int number = input.nextInt();
		
		int sum = 0;
		
		while(number > 0) {
			sum += number % 10;
			number /= 10;
		}
		
		System.out.println("The sum of all the digits is " + sum);
	}
}