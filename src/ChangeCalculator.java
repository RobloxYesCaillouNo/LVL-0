
// Copyright The League of Amazing Programmers 2014

import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. Then
 * make me a sandwich.
 */
public class ChangeCalculator {

	public static void main(String[] args) {
		
		// Ask the user how many nickels they have
	String nickel= 	JOptionPane.showInputDialog("How many nickels do you have?");
		// Convert their answer to an int using Integer.parseInt()
	int nickels= Integer.parseInt(nickel);
		// Ask the user how many dimes they have, and convert their answer
	nickels=nickels*5;
	double change = nickels;
	JOptionPane.showMessageDialog(null,change/100);
	// Ask the user how many quarters they have, and convert their answer

		// Calculate how much money the user has and save it in a double variable 

		// Tell the user how much money they have

	}
}

