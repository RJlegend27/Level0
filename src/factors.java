import javax.swing.JOptionPane;

public class factors {
	static void factor(int a, int i) {
		if (a % i == 0) {
			System.out.println(i + " is a fator of " + a);
		}
	}

	public static void main(String[] args) {

		String num = JOptionPane.showInputDialog("Enter a *beep* *boop* number");
		int a = Integer.parseInt(num);
		for (int i = 1; i <= a; i++) {
			factor(a, i);
		}
	}
}