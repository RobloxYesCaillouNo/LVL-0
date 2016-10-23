import javax.swing.JOptionPane;

public class RUNHAPPY {
public static void main(String[] args) {
	
	String wassup = JOptionPane.showInputDialog("Are You happy??");
	if(wassup.equals("no")){
		String guests = JOptionPane.showInputDialog(null, "Do you want to be happy??");
	if(guests.equals("no")){
	JOptionPane.showMessageDialog(null,"WOW JUST WOW THATS SAD!! ;;(((");
	}
	else if(guests.equals("Yes")){
	JOptionPane.showMessageDialog(null, "Ill cheer u up!");
	}
	else if(wassup.equals("yes")){
		JOptionPane.showMessageDialog(null,"Keep doing what ever your doin!");
	}

}



}

	
}


