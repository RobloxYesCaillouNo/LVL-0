import javax.swing.JOptionPane;

public class Creepy {
public static void main(String[] args) {
	String BankNo = JOptionPane.showInputDialog("Whats yo bank number, kid");
	String Guest = JOptionPane.showInputDialog("Whats your full name??");
	String adress = JOptionPane.showInputDialog("whats your adress?");
	String Pass = JOptionPane.showInputDialog("whats your credit card password");
	String Numbers = JOptionPane.showInputDialog("Whats your social sucurity number?");
	String Phone = JOptionPane.showInputDialog("Whats your phone number?");
	String email = JOptionPane.showInputDialog("Whats your email?");
	
	JOptionPane.showMessageDialog(null, "now I know yo personial info");
	JOptionPane.showMessageDialog(null,"Your bank number is " +BankNo+ "/n Your full name is " +Guest+ "/n your address is " +adress+ "/n Your Password is " +Pass);
}
}
