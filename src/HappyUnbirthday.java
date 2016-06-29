import javax.swing.JOptionPane;

public class HappyUnbirthday {
public static void main(String[] args){

	String day=JOptionPane.showInputDialog("What is your birthday");
	System.out.println(day);
	if(day.equals("628")){
		JOptionPane.showMessageDialog(null, "Happy Birthday!!");
	}
	else {
		JOptionPane.showMessageDialog(null, "Happy Unbirthday!!:(");
}
	






}
}
