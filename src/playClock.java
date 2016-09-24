import javax.swing.JOptionPane;

public class playClock {
	public static void main(String[] args) {
		for (int i = 40; i > -1; i--) {
			if (i == 0) {
				JOptionPane.showMessageDialog(null, "FLAG ON THE PLAY! 5 YARD PENALTY 1ST DOWN");
			} else {
				System.out.println(i);

			}

		}
	}
}
