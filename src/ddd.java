import javax.swing.JOptionPane;

public class ddd {
public static void main(String[] args) {
String grade = JOptionPane.showInputDialog("Whats the student's grade? ONLY DO 0-100");	
double d = Double.parseDouble(grade);



if(d >=90){
JOptionPane.showMessageDialog(null, "You got an A");
}
else if(d >= 80){
JOptionPane.showMessageDialog(null, "You got a B");
}
else if(d >= 70){
JOptionPane.showMessageDialog(null, "You got a C");
}
else if(d >= 60){
JOptionPane.showMessageDialog(null, "You got a D");
}
else if(d < 60){
JOptionPane.showMessageDialog(null, "You got an F");
}else{
JOptionPane.showMessageDialog(null, "System crashed. Error 404 Not found");
}
}
}
//IOEGHAIWUGHDIUWGHIUEGFIUSGAIUGFWQIUGFIUAGIUFBCXKBCFIAUGWIUAGSCJBSIUH IUAGWIBVSXBCIUWGFIAUSG UWH UWAH DUI CAWHGIU AWGHDIU HWADUI WAGHDIU GAWIUDG AWIUDFGAIUSGFIUAWFG
