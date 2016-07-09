import javax.swing.JOptionPane;

public class MultTables {
	static void printMultiplication(int a, int b) {
		System.out.println(a + "x" + b + "=" + a * b);
	}

	public static void main(String[] args) {
		//printMultiplication(tables,i);
		String tables = JOptionPane.showInputDialog("What multiplication tables do you want to see");
		int h=Integer.parseInt(tables);
		for (int i = 1; i < 13; i++) {
			System.out.println(i);
			printMultiplication(i,h);
		}
	}
}
