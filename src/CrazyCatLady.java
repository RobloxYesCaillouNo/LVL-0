import java.net.URI;

import javax.swing.JOptionPane;

public class CrazyCatLady {
	public static void main(String[] args) {

		String cats = JOptionPane.showInputDialog("How many cats do you have?");

		int lady = Integer.parseInt(cats);

		if (lady > 3) {
			JOptionPane.showMessageDialog(null, "You are a crazy cat lady!!");
		}

		else if (lady < 3 && lady > 0) {
			playVideo("https://www.youtube.com/watch?v=ZRCJF9auPZ0");
		}

		else if (lady == 0) {
			playVideo("https://www.youtube.com/watch?v=SKRgktzRvZ0");
		}

	}

	static void playVideo(String videoURL) {
		try {
			URI uri = new URI(videoURL);
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
