 import java.util.Random;

import javax.swing.JOptionPane;

// Copyright Wintriss Technical Schools 2013
public class HighLowGame {

	public static void main(String[] args) {
		// 3. Change this line to give you a random number between 1 - 100. 
		int random = new Random().nextInt(100);
		// 2. Print out the random variable above
		
		// 11. do the following 10 times
		
			// 1. ask the user for a guess using a pop-up window, and save their response 
		String lol = JOptionPane.showInputDialog("Take a guess...");
			// 4. convert the users’ answer to an int (Integer.parseInt(string))
			int lol1 = Integer.parseInt(lol);
			
			// 5. if the guess is correct
			if(lol1 == random) {
JOptionPane.showMessageDialog(null, "U win!");
				// 6. win
			}
			else	 if(lol1 > random) {
			JOptionPane.showMessageDialog(null, "Ur too high");
			JOptionPane.showConfirmDialog(null, "You lost?!");
			}
			// 7. if the guess is high
				// 8. tell them it's too high
			else if(lol1 < random) {
				JOptionPane.showMessageDialog(null, "Ur too low");
			JOptionPane.showConfirmDialog(null, "You lost?!");
			}
			// 9. if the guess is low
				// 10. tell them it's too low
			
		// 12. tell them they lose
			

	}
}

