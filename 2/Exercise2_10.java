/* Use GUI I/O to compute the change required for a dollar amount */

import javax.swing.JOptionPane;

public class Exercise2_10 {
	public static void main(String[] args) {
		String amountString = JOptionPane.showInputDialog("Enter an amount in double, for example 3.14: ");
		
		double amount = Double.parseDouble(amountString);
		
		int remainingAmount = (int)(amount * 100);
		
		int dollars = remainingAmount / 100;
		remainingAmount %= 100;
		
		int quarters = remainingAmount / 25;
		remainingAmount %= 25;
		
		int dimes = remainingAmount / 10;
		remainingAmount %= 10;
		
		int nickels = remainingAmount / 5;
		remainingAmount %= 5;
		
		int pennies = remainingAmount;
		
		String output = "The amount " + amount + " consists of \n" + 
		dollars + " dollars\n" + quarters + " quarters\n" + 
		dimes + " dimes\n" + nickels + " nickels\n" + 
		pennies + " pennies";
		
		JOptionPane.showMessageDialog(null, output);
	}
}