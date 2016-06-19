import javax.swing.JOptionPane;

import org.omg.Messaging.SyncScopeHelper;

public class Challenge {
public static void main(String[] args) {
	
	
String age = JOptionPane.showInputDialog("How old are you??");	

	
String name = JOptionPane.showInputDialog("Tell me a name please; not anything else");

JOptionPane.showMessageDialog(null, "Your name must be " + name);

String age2 = JOptionPane.showInputDialog("How old are you??");	

String name2 = JOptionPane.showInputDialog("Tell me a name please; not anything else");

JOptionPane.showMessageDialog(null, "Your name must be " + name2);		

int age1 = Integer.parseInt(age);
int happyface = Integer.parseInt(age);
if(age1 > happyface){
System.out.println(name + " is older");

}
	
	
	} 

}