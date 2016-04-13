/* Reverse an integer */

import java.util.Scanner;

public class Exercise5_4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		
		System.out.println(num + " reversed is " + reverse(num));
	}
	
	public static int reverse(int number) {
		int reversedNum = 0;
		
		while(number != 0) {
			int remainder = number % 10;
			
			reversedNum = reversedNum * 10 + remainder;
			number /= 10;
		}	
		return reversedNum;
	}
}