
// Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;

public class BananaQuiz
{
	
	public static void main(String[] args)
	{
		
		
		//1. ask the user if they like bananas
		String answer = JOptionPane.showInputDialog("Do you like bananas?");
		
		//2. if they say no, 
		if(answer.equals("no")){
		JOptionPane.showMessageDialog(null,"You are sooooo crazy!!!!!");
		}
		//tell them they are crazy 
			//and end quiz
		
		//3. if they say yes
		else if(answer.equals("yes")){
		String hip = JOptionPane.showInputDialog("Whats yo favorite hobby?");
		JOptionPane.showMessageDialog(null, hip+ (" is much better with bananas! lol. G3t rekt..."));	
			//	ask them what is their favorite hobby
		//	show a pop up that says "<your hobby> is much better with bananas!"
		}
		//4. OPTIONAL: if they say something other than “yes” or “no”
		else{
		JOptionPane.showMessageDialog(null, "You are bananas!");		}
		
		//	show a pop up that says “You are bananas!”
	
	}
	}

