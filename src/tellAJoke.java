import javax.swing.JOptionPane;

public class tellAJoke {
	static void tellJoke() {
		JOptionPane.showMessageDialog(null, "Why was charlie crying");
		JOptionPane.showMessageDialog(null, "Because his brother died");
	}

	public static void main(String[] args) {
		String userInput = JOptionPane.showInputDialog("Do you want to hear a joke");
		if (userInput.equalsIgnoreCase("no")) {
			JOptionPane.showMessageDialog(null, "ok, bye");
		}
		if (userInput.equalsIgnoreCase("yes")) {
			tellJoke();
			String annoyInput = JOptionPane.showInputDialog("On a scale from 1-10 how annoying am I");
			int numAnnoying = Integer.parseInt(annoyInput);
			if (numAnnoying >= 1 && 10 >= numAnnoying) {
				for (int i = 1; i < numAnnoying + 1; i++) {
					tellJoke();
				}
				
				}
			else{
				JOptionPane.showMessageDialog(null,"Ok thats impossible");			
			}
				}
				
			}
		}
