/* Convert decimal to hex without using Integer.toHexString(int) */

import java.util.Scanner;

public class Exercise4_38 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter an integer: ");
		int decimalValue = input.nextInt();
		
		String hexValue = "";
		int value = decimalValue;
		
		while(value != 0) {
			int single = value % 16;
			
			if(single == 15)	hexValue = "F" + hexValue;
			else if(single == 14)	hexValue = "E" + hexValue;
			else if(single == 13)	hexValue = "D" + hexValue;
			else if(single == 12)	hexValue = "C" + hexValue;
			else if(single == 11)	hexValue = "B" + hexValue;
			else if(single == 10)	hexValue = "A" + hexValue;
			else	hexValue += single;
			
			value = value / 16;
		}
		
		System.out.println("The hex value of " + decimalValue + " is " + hexValue39);
	}
}