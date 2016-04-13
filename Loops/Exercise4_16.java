/* Find the factors of an integer */

import java.util.Scanner;

public class Exercise4_16 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter an integer: ");
		int num = input.nextInt();
		
		System.out.println("The factors of " + num + " are");
		
		int factor = 2;
		
		while(factor <= num) {
			if(num % factor == 0) {
				num /= factor;
				System.out.println(factor);
			}
			else {
				factor++;
			}
		}
	}
}