

	 // Copyright Wintriss Technical Schools 2013
	import javax.swing.JOptionPane;

	public class BirthdayReminder {

		public static void main(String[] args) {
		
			// 1. correct the birthdays for your family below
			String momsBirthday = "January 90th";
			String dadsBirthday = "June 665th";
			String myBirthday = "July 27";

			// 2. Find out which birthday the user wants and and store their response in a variable
	String person =JOptionPane.showInputDialog(null,"whose bday is it");
			// 3. Print out what the user typed
			JOptionPane.showMessageDialog(null,"it is " +person);
			// 4. if user asked for "mom"
			if(person.equalsIgnoreCase("mom")) 
			JOptionPane.showMessageDialog(null, momsBirthday);
				//print mom's birthday
			// 5. if user asked for "dad"
			if(person.equalsIgnoreCase("dad"))
			JOptionPane.showMessageDialog(null, dadsBirthday);
				// print dad's birthday
			// 6. if user asked for your name
			if(person.equalsIgnoreCase("mine"))
			JOptionPane.showMessageDialog(null, myBirthday);
				// print myBirthday
			//7. otherwise print "Sorry, i don't remember that person's birthday!"

		} 
	}


