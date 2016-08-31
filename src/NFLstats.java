import javax.swing.JOptionPane;

public class NFLstats {

	public static void main(String[] args) {
		String NFL = JOptionPane.showInputDialog("Enter a NFl player");
		String AntonioBrown = "Antonio Brown";
		String AdrianPeterson = "Adrian Peterson";
		String CamNewton = "Cam Newton";
		String JJWatt = "JJ Watt";
		String VonMiller = "Von Miller";
		String TomBrady = "Tom Brady";
		String LukeKuechly = "Luke Kuechly";
		String AaronRodgers = "Aaron Rodgers";
		String JulioJones = "Julio Jones";
		
		if(NFL.equalsIgnoreCase(JulioJones)){
			JOptionPane.showMessageDialog(null, "Julio Jones stats last year were" + " 136 receptions, 1,871 yards, 8 Touchdowns, 93 first downs made!!!, and Averages 13.8 yards a series!!!");
		}else{
		}
		if(NFL.equalsIgnoreCase(AaronRodgers)){
			JOptionPane.showMessageDialog(null, "Aaron Rodgers's stats last year were" + " 3,821 yards!, 31 Touchdowns Thrown, 1 rushing Touchdown," +
		" 8 interceptions, and Averages 6.7 yards a series");
		}else{
		}
		if(NFL.equalsIgnoreCase(LukeKuechly)){
			JOptionPane.showMessageDialog(null, "Luke Kuechly's stats last year were" + " 76 Tackles!!!, 1 Sack, 2 Forced Fumbles, 4 interceptions! and Assisted 42 Tackles!" );
		}else{
		}
		if(NFL.equalsIgnoreCase(TomBrady)){
			JOptionPane.showMessageDialog(null, "Tom Brady's stats last year were" + " 4,770 yards thrown!!!, 36 Touchdowns Thrown!, 3 rushing touchdowns," +
		" 7 interceptions, and Averages 7.6 yards a series");
		}else{
		}
		if(NFL.equalsIgnoreCase(VonMiller)){
			JOptionPane.showMessageDialog(null, "Von Miller's stats last year were" + " 30 Tackles, 11 Sacks, and 4 Forced Fumbles!!!, and Assisted 5 takles");
		}else{
		}
		if(NFL.equalsIgnoreCase(JJWatt)){
			JOptionPane.showMessageDialog(null, "JJ Watt's stats last year were" + " 57 Tackles!, 18 Sacks!!!, 3 Forced Fumbles, and Assisted 19 Tackles");
		}else{
		}
		if(NFL.equalsIgnoreCase(CamNewton)){
			JOptionPane.showMessageDialog(null, "Cam Newton's stats last year were" + " 3,837 yards thrown!, 35 Touchdowns Thrown!, 10 Rushing Touchdowns!!!" + 
					 "10 interceptions, and Averages 7.8 yards a series");
		}else{
		}
		if (NFL.equalsIgnoreCase(AdrianPeterson)) {
			JOptionPane.showMessageDialog(null, "Adrian Peterson's stats last year were" + "1,485 yards!, 11 Touchdowns!," + " 71 First downs!!!"
		+ " Averages 4.5 yards a series");
		} else {
		}
		if (NFL.equalsIgnoreCase(AntonioBrown)) {
			JOptionPane.showMessageDialog(null, "Antonio Browns's stats last year were" + " 136 receptions, 1,834 yards, "
					+ " Antonio Brown has 10 touchdowns!!!, 84 first downs made!" + " Antonio Brown averages 13.5 yards a series!");
		} else {
		}
	}
}