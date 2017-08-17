import javax.swing.JOptionPane;

public class SimpleCalculator {
	public static void main(String[] args) {
		for (int i = 0; i < 999999999; i++) {

			// 1. Get 2 numbers from the user and convert them to integer.
			String hihi = JOptionPane.showInputDialog("Insert a number for calculator");
			String hihi0 = JOptionPane.showInputDialog("Insert another number");
			int lmao = Integer.parseInt(hihi);
			int lmao1 = Integer.parseInt(hihi0);
			// 2. Customize pop-up to support add/subtract/multiply/divide operations.
			int operation = JOptionPane.showOptionDialog(null, "What do u wanna do?", "Lol_D(YG(EDY9e", 0,
					JOptionPane.INFORMATION_MESSAGE, null, new String[] { "+", "-", "x", "÷" }, null);

			// 5. Call the methods created in steps 3 and 4 to perform the appropriate
			// operation.
			if (operation == 0) {
				add(lmao, lmao1);
			} else if (operation == 1) {
				subtract(lmao, lmao1);
			} else if (operation == 2) {
				multiply(lmao, lmao1);
			} else if (operation == 3) {
				divide(lmao, lmao1);
			}
		}
		// 6. Wrap steps 1, 2 and 5 in a for loop to repeat calculator operations

	}

	// 3. Create method for addition operation.
	// Method should create pop-up that shows equation and solution, eg. 45 + 25 =
	// 70.
	// HINT: use 'static void add(int num1, num2) { ... }
	static void add(int hihi, int hihi0) {
		JOptionPane.showMessageDialog(null, (hihi + hihi0));
	}

	// 4. Create similar methods for subtraction, multiplication and division.
	static void subtract(int hihi, int hihi0) {
		JOptionPane.showMessageDialog(null, (hihi - hihi0));
	}

	static void multiply(int hihi, int hihi0) {
		JOptionPane.showMessageDialog(null, (hihi * hihi0));
	}

	static void divide(int hihi, int hihi0) {
		JOptionPane.showMessageDialog(null, (hihi / hihi0));
	}
}
