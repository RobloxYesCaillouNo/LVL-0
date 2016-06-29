import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {

	// 1. Make a main method that includes all the steps below….
public static void main(String[] args) {
	

	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"
	int secret=new Random().nextInt(4);
	// 3. Print out this variable
	System.out.println(secret);
	// 4. Get the user to enter a question for the 8 ball
	JOptionPane.showInputDialog("Enter a question please.");
	// 5. If the random number is 0
if(secret==0){
JOptionPane.showMessageDialog(null,"Yes");
}
	// -- tell the user "Yes"

	// 6. If the random number is 1
if(secret==1){
	JOptionPane.showMessageDialog(null,"No");
	
	}
	
if(secret==2){
JOptionPane.showMessageDialog(null,"Maybe you should ask google?");
}
if(secret==3){
	// -- write your own answer
JOptionPane.showMessageDialog(null,"Error 404 not found");
}


}
}

