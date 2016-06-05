
import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		
		String momsBirthday = "May 4th";
		String dadsBirthday = "May 4th";
		String myBirthday = "April 22th";

		
		String Birthday = JOptionPane.showInputDialog("What birthday do you want?");
		
		System.out.println(Birthday);
		
		
			if(Birthday.equals("mom")){
		System.out.println(momsBirthday);
			}		
			if(Birthday.equals("dad")){
		System.out.println(dadsBirthday);
			}
			if(Birthday.equals("You")){
			System.out.println(myBirthday);
				}else{
			System.out.println("Sorry, I don't remember that persons birthday!!");
		
				}
	} 
}
