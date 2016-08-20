
// Copyright Wintriss Technical Schools 2014
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;

/**
 * Secret Message Box / Secure Messaging System
 * 
 * You want to leave a message on one of the Mac computers so that only your
 * friend can read it. You set up the passcode and the secret message. Your
 * friend types in the passcode to retrieve the message.
 * 
 */

public class secretMessageBox {
	public static void main(String[] args) {

		// 1. Set the passcode in a String variable

		String password = "rabbitfoot";
		// 2. Using a pop-up, ask for a secret message and store it in a
		// variable
		String passcode = JOptionPane.showInputDialog("*in a quite voice* What is the secret password or passcode?");
		// 3. Ask your friend for the passcode and store it in a variable
		
		if(passcode.equals(password)){
			JOptionPane.showMessageDialog(null,"you now have access to the planet mers, a dump version of MARS ");
		} 
		// 4. If the passcode matches, show the secret message

		// 5. If the passcode does not match, pop-up "INTRUDER!!"

	}

}
