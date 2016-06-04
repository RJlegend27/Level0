import javax.swing.JOptionPane;

public class BananaQuiz {

	public static void main(String[] args) {
		String banana;
		String hobby;
		// 1. ask the user if they like bananas
		banana = JOptionPane.showInputDialog(null, "Do you like Bananas!");
		// 2. if they say no,
		if (banana.equalsIgnoreCase("no")) {
			JOptionPane.showMessageDialog(null, "You are crazy");
		}
	
		// tell them they are crazy
		// and end quiz
		// 3. if they say yes
		else if (banana.equalsIgnoreCase("yes")){
				hobby = JOptionPane.showInputDialog(null,"What is your favorite hobbie");
				 JOptionPane.showMessageDialog(null, hobby +" is much better with bananas!");	
			}	
				
					
				
		// ask them what is their favorite hobby
		// show a pop up that says "<your hobby> is much better with bananas!"
			else{	
				JOptionPane.showMessageDialog(null,"YOU ARE BANANANANANNANANANNAS");
			}
			
			
		// 4. OPTIONAL: if they say something other than “yes” or “no”
		// show a pop up that says “You are bananas!”

	}

}
