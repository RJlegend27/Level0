import javax.swing.JOptionPane;

public class CountDown {
	public static void main(String[] args) {
		String userinput;
		userinput = JOptionPane.showInputDialog("Houston what shall we count down from?");
		int usernum = Integer.parseInt(userinput);
		for (int i = usernum; i >= 0; i--) {
			System.out.println(i);
		}
		System.out.println("BLASTOFF!!");

	}
}
