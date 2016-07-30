import java.util.Random;

import javax.swing.JOptionPane;

public class Dice {
	public static void main(String[] args) {
		String sides = JOptionPane.showInputDialog("How many sides are on the die");
		int numdice = Integer.parseInt(sides);
		int number = new Random().nextInt(numdice + 1);
		JOptionPane.showMessageDialog(null,"You rolled a " +number);
		
	}
}
