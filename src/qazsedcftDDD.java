import javax.swing.JOptionPane;

public class qazsedcftDDD {
	public static void main(String[] args) {
boolean prime = true;
		String Dot = JOptionPane.showInputDialog("Insert number here or play on my tacky roblox game!");
		int Robloxisbetter = Integer.parseInt(Dot);

		for (int j = 2; j < Robloxisbetter; j++) {
			if (Robloxisbetter % j == 0) {
				prime = false;
			}
		}
	 System.out.println(prime);
	}
}
