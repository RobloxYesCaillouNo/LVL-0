import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Test {
public static void main(String[] args) {
	ImageIcon iconI = new ImageIcon("tUfyPFW.png");
String a =(String) JOptionPane.showInputDialog(null,"How many squares are there?",null,0,iconI,null,null);
int b = Integer.parseInt("Pixels");
if(b==100000){
JOptionPane.showMessageDialog(null, "Yay u got it!! :DDD");

}
}


}
