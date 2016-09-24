
	import org.jointheleague.graphical.robot.Robot;
import org.teachingextensions.logo.Tortoise;

import java.awt.Color;


	/*** Teacher's note ***/
	 /* Before beginning recipe: 
	 * 1. ask students to find and explain the variables in this recipe. 
	 * 2. ask students what robot commands they think they will use to make picture in the laminated hand-outs: http://bit.ly/ninja-star */

	public class NinjaStar {
		public static void main(String[] args) {

			int baseSize = 300;		//the size of the black part of the star
			int flameSize = 200;		//the length of the flaming arms

			// 1. Make a new robot, and set it's pen down.
				Tortoise.show();
				Tortoise.penDown();
			// *14. Use the methods setX and setY to move the ninja star into the center of the screen
				
				
			// *15. Make some adjustments to see what other kinds of shapes you can make.

			// 12. Set the robot speed to 10
				Tortoise.setSpeed(10);
			// 13. Make all the code below repeat 25 times
				for(int i = 1;i<25;i++ ){
					
				
				// 2. Turn the robot 1/8 of a circle
				Tortoise.turn(45);
				// 3. Move the robot 64 pixels
				Tortoise.move(64);
				Tortoise.setPenColor(Color.CYAN);
				// 4. Turn the robot 40 degrees to the LEFT. (Negative numbers will turn the robot counter-clockwise.)
				Tortoise.turn(-40);
				// 5. Move the robot the distance in the variable flameSize
				Tortoise.move(flameSize);
				Tortoise.setPenColor(Color.PINK);
				// 6. Turn the robot 170 degrees
				Tortoise.turn(170);
				// 7. Move the robot the distance in the variable flameSize (again)
				Tortoise.move(flameSize);
				Tortoise.setPenColor(Color.BLUE);
				// 8. Turn the robot 64 degrees to the right
				Tortoise.turn(64);
				Tortoise.setPenColor(Color.YELLOW);
				// 9. Move the robot the distance in the variable baseSize
				Tortoise.move(baseSize);
				// 10. Check that your shape is the same as Figure 1. This is one arm of the ninja star.
				// 11. Color your ninja star like Figure 2.
				}
		}

		private static void setY(int i) {
			// TODO Auto-generated method stub
			
		}

		private static void setX(int i) {
			// TODO Auto-generated method stub
			
		}

	





}

