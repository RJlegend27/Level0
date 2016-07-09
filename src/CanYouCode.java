import javax.swing.JOptionPane;

public class CanYouCode {
	public static void main(String[] args) {
		String code = JOptionPane.showInputDialog("Do you know how to code");
		if(code.equalsIgnoreCase("yes")){
			System.out.println("You will rule the universe");
		}
		else{
			System.out.println("You should get coding");	
		}
	
	
	}
}
