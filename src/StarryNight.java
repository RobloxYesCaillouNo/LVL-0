
import java.awt.Color;
import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class StarryNight {
	// 1. Create a new Robot.
	Robot a = new Robot();

	public StarryNight() {
		// 2. Using your robot name, print the window width and height to the
		// console

		// a.getWindow().getWidth();
		// a.getWindow().getHeight();

		// 3. Set the robot's speed to draw FAST!
		a.setSpeed(10000);
		a.hide();
		// 4. For a night sky, use the following line of code:
		Robot.setWindowColor(Color.BLACK);

		// 10. Do steps 7-9 100 times.
		for (int i = 0; i < 10001; i++) {

			// 7. Set your robot pen color to be random.
			a.setRandomPenColor();

			// 8. Call the moveStar() method created in step 5.
			moveStar();
			// 9. Call the drawStar() method created in step 6.
			drawStar();
		}

		// 11. Hide your robot so that you can see your beautiful starry sky!!

	}

	// 5. Create a moveStar() method that moves your robot to a random
	// position using setX() and setY().
	// Step 2 will tell you how big your canvas is.
	void moveStar() {
		a.setX(new Random().nextInt(900));
		a.setY(new Random().nextInt(900));
	}

	// 6. Create a drawStar() method that draws a star.
	// Use a random number for the size of the star (experiment to
	// determine the size of your largest star).
	// Hint: 144 degrees
	void drawStar() {
		a.penDown();
		int r = new Random().nextInt(15);
		for (int i = 0; i < 5; i++) {
			a.move(r);
			a.turn(144);
		}
	}

	public static void main(String[] args) {
		new StarryNight();
	}
}
