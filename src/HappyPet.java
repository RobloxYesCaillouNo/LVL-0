import javax.swing.JOptionPane;

public class HappyPet {
	// 2. Create a happinessLevel variable to store the pet's happiness number.
	// Initialize to zero.
	int happinessLevel = 0;
	static String pet;

	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store in
		// variable
		pet = JOptionPane.showInputDialog("What Pet Do u want?");
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
for(int i =0;i < 6;i++){
		// 3. Use showOptionDialog to ask the user what they want to do to make
		// their pet happy
		// (eg: cuddle, food, water, take a walk, groom, clean up poop).
		// Make sure to customize the title and question too.
		int task = JOptionPane.showOptionDialog(null, "What do you want to do to make ur pet happy?",
				"Make ur pet happy!", 0, JOptionPane.INFORMATION_MESSAGE, null,
				new String[] { "Food", "Take a walk", "Groom" }, null);

		// 5. Use user input to call the appropriate method created in step 4.

		// 6. If you determine the happiness level is large enough, tell the
		// user that he loves his pet and use break; to exit for loop.

	}

	// 4. Create methods to handle each of your user selections.
	// Each method should create a pop-up with the pet's response (eg. cat might
	// purr when pet),
	// and INCREMENT the pet's happiness Level.
	public void food() {
		if(int == 1){
		JOptionPane.showMessageDialog(null, pet + " will be less hungry with food...");
		}
	}

}
