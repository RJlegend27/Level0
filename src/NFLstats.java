import javax.swing.JOptionPane;

public class NFLstats {

	public static void main(String[] args) {
		String NFL = JOptionPane.showInputDialog("Enter a NFl player");
		String AntonioBrown = "AntonioBrown";
		String AdrianPeterson = "AdrianPeterson";
		if (NFL.equalsIgnoreCase(AdrianPeterson)) {
			JOptionPane.showMessageDialog(null, "Adrian Peterson's stats last year were." + "");
		} else {
		}
		if (NFL.equalsIgnoreCase(AntonioBrown)) {
			JOptionPane.showMessageDialog(null, "Antonio Browns's stats last year were." + " 136 catches, 1,834 yards, "
					+ "Antonio Brown averages 13.5 yards a play!, Antonio Brown has 10 touchdowns and 84 first downs made!");
		} else {
		}
	}
}