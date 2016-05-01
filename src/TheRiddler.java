import javax.swing.JOptionPane;

public class TheRiddler {

	public static void main(String[] args) {

	
		int score=0;
		
	String answer =  JOptionPane.showInputDialog("What gets wetter the more it dries?");
		
		if(answer.equals("towel")){
			JOptionPane.showMessageDialog(null,"Correct :)");
			score=+1;
			JOptionPane.showMessageDialog(null,"Your score "+score);
		}else{
		JOptionPane.showMessageDialog(null,"Wrong, the answer is towel");
}
		

		
	String answer2=  JOptionPane.showInputDialog("What month has 28 days in the year");
		
		if(answer2.equals("All of them")){
			JOptionPane.showMessageDialog(null,"Correct :)");
			score=+2;
		}else{
		JOptionPane.showMessageDialog(null,"Wrong, the answer is All of them");
}
		
		JOptionPane.showMessageDialog(null,"Your score "+score);
	}
}

