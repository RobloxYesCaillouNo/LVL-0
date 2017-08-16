// Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;

import org.teachingextensions.logo.Tortoise;

public class SpiralMaker {

	public static void main(String[] args) {
		Tortoise.setSpeed(10);
		// 3. Make a variable to hold the number of sides and set it to 0
		int sieds = 0;
		// 4. Ask the user which spiral they would like (square, triangle, or pentagon)
	String n00b = JOptionPane.showInputDialog("What sprial do u want: Square, triangle, or pentagon, centiligon (no caps)");
		// 5. Set the number of sides depending on what the user entered (multiple lines of code)
		if (n00b.equals("triangle")) {
			Tortoise.penDown();
		sieds = 3;
		}
		else if (n00b.equals("square")) {
		Tortoise.penDown();	
		sieds = 4;
		}
		else if(n00b.equals("pentagon")) {
		Tortoise.penDown();
		sieds = 5;
		}
		else if(n00b.equals("centiligon"))
		sieds = 303;
			// 6. If the user enters something else, say "Sorry, I don't know how to draw a ..."
		else{
		JOptionPane.showConfirmDialog(null, "Sorry, I dont know how to draw a " +n00b);
		}
		// 1. Make the Tortoise draw a square spiral shape. If you get stuck, use these instructions: http://bit.ly/YJUOkn
		for (int k = 0; k < 80; k++) {
			Tortoise.move(5 * k);
		Tortoise.turn(360/sieds);
		}
		
		// 2. Change your code to turn the square spiral into a triangle spiral
		
		}
		
	}





//Copyright Wintriss Technical Schools 2013
//Do the following 80 times
		//Move the Tortoise a distance of 4 multiplied by i
		//Turn the Tortoise 360/4
