import java.util.Random;

import javax.swing.JOptionPane;

public class lottoNumbrs {
	public static void main(String[] args) {
		Random randum = new Random();
		int random =  randum.nextInt(51);
		int random1 =  randum.nextInt(51);
		int random2 =  randum.nextInt(51);
		int random3 =  randum.nextInt(51);		
		int random4 =  randum.nextInt(51);
		JOptionPane.showMessageDialog(null, "luky numbers: "+random+ ", "+ random1+", "+random2+", "+ random3+", "+ random4+" ");
	}
}
