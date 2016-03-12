//Copyright Wintriss Technical Schools 2014
import javax.swing.JOptionPane;

public class CANDYCRUSH {

	public static void main(String[] args) { String nameOfString = "like";
	
		// 1. Using a pop-up, ask the user who they don't like
		String answer = JOptionPane.showInputDialog(null,"Who don't you like");
		// 2. Change the next line so that the pop-up will tell them they have a crush on that person
		JOptionPane.showMessageDialog(null, "You totally have a crush on " + answer);
		// 3. Ask the user for the name of their best friend
		String friend = JOptionPane.showInputDialog(null, "Who is your best friend?");
		// 4. Tell them their best friend is as sweet as candy
		JOptionPane.showMessageDialog(null, friend +" is as sweet as candy");
		String burger =JOptionPane.showInputDialog(null, "Who is the most like a cheeseburger");
		JOptionPane.showMessageDialog(null, "wrong "+burger+" is the least like a cheeseburger");
	} 
}



