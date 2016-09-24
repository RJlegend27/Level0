import javax.swing.JOptionPane;

public class makeYourOwnGoalie {
public static void main(String[] args) {
	String username = JOptionPane.showInputDialog("Enter your goalie");
	String usersaves =JOptionPane.showInputDialog("Enter the number of saves");
	String usershots = JOptionPane.showInputDialog("Enter the number of shots on goal");
	JOptionPane.showMessageDialog(null, username + " has saved" +usersaves+ " and has scored on");
}
}
