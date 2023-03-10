package _01_double._1_change_calculator;

import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain.
 */

public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
String nickels  = JOptionPane.showInputDialog("How many nickels do you have?");
		// Convert their answer to an int.   Hint: Integer.parseInt()  
int nickelsNumber = Integer.parseInt(nickels);
		// Ask the user how many dimes they have, and convert their answer
String dimes = JOptionPane.showInputDialog("How many dimes do you have?");
		// Ask the user how many quarters they have, and convert their answer
int dimesNumber = Integer.parseInt(dimes);
		// Calculate how much money the user has.  Hint: Use a double variable 
String quarters = JOptionPane.showInputDialog("How many quarters do you have?");
 // Tell the user how much money they have in dollars and cents format (e.g. $6.75)
int quartersNumber = Integer.parseInt(quarters);
JOptionPane.showMessageDialog(null, "Your total is $" + String.format("%.2f",(quartersNumber*0.25 + dimesNumber*0.10 + nickelsNumber*0.05)));
	}
}

