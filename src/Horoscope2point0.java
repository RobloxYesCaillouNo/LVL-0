import java.util.Random;

import javax.swing.JOptionPane;

public class Horoscope2point0 {
	public static void main(String[] args) {

		String diy = JOptionPane.showInputDialog("enter birthday day plzzzzz");

		int f = new Random().nextInt(1337);

		if (f == 1) {
			JOptionPane.showMessageDialog(null, "U will die in 1234567890 years");
		} else if (f == 2) {
			JOptionPane.showMessageDialog(null, "You will die in 010102020203030303040404045005060606070707080080909009 yees.");
		} else if (f == 3) {
			JOptionPane.showMessageDialog(null, "lol, you will die by playing Roblox: The Minecraft V843256 For 283758973483 Years till u die");
		} else if (f == 4) {
			JOptionPane.showMessageDialog(null, "you will die on March 18 2017");
		}

	}
}
