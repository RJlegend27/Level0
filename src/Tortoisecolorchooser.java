

	// Copyright Wintriss Technical Schools 2013
	import javax.swing.JOptionPane;
	import java.awt.Color;
	import org.teachingextensions.logo.Colors;
	import org.teachingextensions.logo.Tortoise;

	public class Tortoisecolorchooser {
		public static void main(String[] args) {

			//3. ask the user what color they would like the tortoise to draw
			String type =JOptionPane.showInputDialog("What colour do you wish gim to draw");
			//4. use an if/else statement to set the pen color that the user requested
			if(type.equalsIgnoreCase("red")){
				
				Tortoise.setPenColor(Color.red);
			}
	//5. if the user doesn’t enter anything, choose a random color
			else if(type.equals("")){
				int numberred =(int)(Math.random() *255);
				new Color (0 , 255  ,255);
				
				
			}
			
	//6. put a loop around your code so that you keep asking the user for more colors & drawing them
			
			//2. set the pen width to 10
			Tortoise.setPenWidth(10);
		//1. make the tortoise draw a shape (this will take more than one line of code)

Tortoise.show();
Tortoise.setSpeed(8);
Tortoise.move(30);
Tortoise.turn(80);
Tortoise.move(30);
Tortoise.turn(80);
Tortoise.move(30);
Tortoise.turn(80);
Tortoise.move(30);
Tortoise.turn(80);
Tortoise.move(30);
Tortoise.turn(80);
Tortoise.move(30);
Tortoise.turn(80);
Tortoise.move(30);
Tortoise.turn(80);
Tortoise.move(30);
Tortoise.turn(80);
Tortoise.move(30);
Tortoise.turn(80);
Tortoise.move(30);
Tortoise.turn(80);
Tortoise.move(30);
Tortoise.turn(80);
Tortoise.move(30);
Tortoise.turn(80);
Tortoise.move(30);
Tortoise.turn(80);
Tortoise.move(30);
Tortoise.turn(80);
Tortoise.move(30);
Tortoise.turn(80);
Tortoise.move(30);
Tortoise.turn(80);
Tortoise.move(30);
Tortoise.turn(80);
Tortoise.move(30);
Tortoise.turn(80);
Tortoise.move(30);
Tortoise.turn(80);
Tortoise.move(30);
Tortoise.turn(80);
Tortoise.move(30);
Tortoise.turn(80);
Tortoise.move(30);
Tortoise.turn(80);
Tortoise.move(30);
Tortoise.turn(80);
Tortoise.move(30);
Tortoise.turn(80);
Tortoise.move(30);
Tortoise.turn(80);
Tortoise.move(30);
Tortoise.turn(80);
Tortoise.move(30);
Tortoise.turn(80);
Tortoise.move(30);
Tortoise.turn(80);
Tortoise.move(30);
Tortoise.turn(80);
Tortoise.move(30);
Tortoise.turn(80);
Tortoise.move(90);
		}
	




	}
