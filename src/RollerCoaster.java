import javax.swing.JOptionPane;

public class RollerCoaster {
	public static int calculateInches(int feet, int inches) {
		return 12 * feet + inches;
	}

	public static void main(String[] args) {
		String ride = JOptionPane.showInputDialog("HOW TALL SHOULD THE RIDE BE MAYOR IN INCHES");
		int rideInt = Integer.parseInt(ride);
		String feet = JOptionPane.showInputDialog("YOU MUST BE THIS TALL! HOW MANY FEET ARE YOU?");
		String inches = JOptionPane.showInputDialog("AND INCHES");
		int feetInt = Integer.parseInt(feet);
		int inchesInt = Integer.parseInt(inches);
		int height = calculateInches(feetInt, inchesInt);
		System.out.println(height);
		if(feetInt >= rideInt && inchesInt >= rideInt){
			JOptionPane.showMessageDialog(null, "YOU MAY PASS!");
		}else{
			JOptionPane.showMessageDialog(null, "BYE BYE");
			JOptionPane.showMessageDialog(null, "you must grow "+ inches + " inch(es)");
		}
	}
}
