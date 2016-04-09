import javax.swing.JOptionPane;

public class MoringZombie {
	static void DoWeekdaySchedule() {
		JOptionPane.showMessageDialog(null, "1) Get up");
		JOptionPane.showMessageDialog(null, "2) Go to Donut store and buy a turkey");
		JOptionPane.showMessageDialog(null, "3) Be friends with donut manager");
		JOptionPane.showMessageDialog(null, "4) Repeat from step 2");
	}

	static void DoWeekendSchedule() {
		JOptionPane.showMessageDialog(null, "1) Get up");
		JOptionPane.showMessageDialog(null, "2) Go to Candy store and buy a turkey");
		JOptionPane.showMessageDialog(null, "3) Be friends with the Candy Manager");
		JOptionPane.showMessageDialog(null, "4) eat your hand off");
	}

	public static void main(String[] args)

	{
		JOptionPane.showInputDialog(null, "You are god, what day do you want it to be for the Zombie ");
		DoWeekdaySchedule();
		DoWeekendSchedule();
	}
}
