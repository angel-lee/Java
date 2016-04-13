/* Find the character of an ASCII code */

import java.util.Scanner;

public class Exercise2_8 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number between 0 and 128: ");
		int asciiCode = input.nextInt();
		
		char asciiChar = (char)asciiCode;
		
		System.out.println("The character for ASCII code " + asciiCode + " is " + asciiChar);
	}
}