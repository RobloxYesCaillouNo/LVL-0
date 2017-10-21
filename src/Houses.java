import org.jointheleague.graphical.robot.Robot;

public class Houses {
	static Robot b = new Robot();
static void start() {
	b.setX(100);
	b.setY(600);
}
static void draw() {	
	b.setRandomPenColor();
	b.penDown();
	b.setPenWidth(3);
	b.setSpeed(30);
	b.move(100);
b.turn(72);
b.move(15);
b.turn(45);
b.move(15);
b.turn(63);
b.move(100);
b.turn(90);
b.setPenColor(0,200,0);

b.move(15);
}

public static void main(String[]args) {
		b.setWindowSize(2000, 1000);

	
	
	start();
	draw();
	
}

}