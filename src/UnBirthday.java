import javax.swing.JOptionPane;

public class UnBirthday {
public static void main(String[] args) {
	String birth = "3/12";
	String happy = "today";			
	String day =JOptionPane.showInputDialog(null, "when is your B-Day");
	if( day.equals (birth)){
		JOptionPane.showMessageDialog(null, "HAPPY BIRTHDAY");
	}
	else{ JOptionPane.showMessageDialog(null,"HAPPY UNBIRTHDAY");
}}
}
