import org.teachingextensions.logo.Tortoise;

// Copyright Wintriss Technical Schools 2014

/*** Teacher's note ***/
/*
 * Start by reviewing the 3 pieces of a for loop (initialization, condition,
 * increment). Do not give the students the answer to the challenge.
 */

public class walkOfFame {
	public static void starU() {
		Tortoise.penDown();
		for (int i = 0; i < 6; i++) {
			Tortoise.turn(144);
			Tortoise.move(144);

		}
	}

	public static void shape() {
		Tortoise.setX(770);
		Tortoise.setY(450);
		Tortoise.penDown();

		for (int x = 0; x < 360; x++) {
			Tortoise.move(1);
			Tortoise.turn(1);

		}
		Tortoise.penUp();
		Tortoise.turn(90);
		Tortoise.move(58);
		Tortoise.turn(-90);
		Tortoise.move(440);
	}

	public static void starme() {
		Tortoise.penDown();
		Tortoise.setPenWidth(25);
		Tortoise.turn(270);
		Tortoise.setSpeed(10);
		for (int e = 0; e < 2; e++) {
			
			for (int i = 0; i < 2; i++) {

				Tortoise.move(200);
				Tortoise.turn(-45);
				Tortoise.move(500);
				Tortoise.turn(-45);
			}
			Tortoise.move(200);

		}
	}
	public static void crazy(){
		Tortoise.setPenWidth(5);
		//for(int i = 0; i < 2; i++){
		Tortoise.turn(-45);
		Tortoise.move(150);
		Tortoise.turn(-45);
		Tortoise.turn(-90);
		Tortoise.move(25);
		Tortoise.turn(90);
		Tortoise.turn(45);
		Tortoise.move(150);
		Tortoise.turn(135);
		Tortoise.turn(55);
		Tortoise.move(150);
		
		
	//}
		
	}

	public static void main(String[] args) {

		// 1. Set the X position of the Tortoise so that it starts on the left.
		Tortoise.show();
		Tortoise.setX(550);
		Tortoise.setY(550);
		// You also need to show the Tortoise to see the result of this line.
		Tortoise.setSpeed(10);
		// 2. Make the Tortoise draw a star shape. Hint: 144.
		Tortoise.penDown();
		Tortoise.setPenWidth(105);

		for (int i = 0; i < 10; i++) {
			starU();
			Tortoise.turn(0);
			Tortoise.penUp();
			Tortoise.move(50);
			Tortoise.turn(900);
			Tortoise.move(8);

		}

		shape();
		starme();
		Tortoise.penUp();
		Tortoise.move(500);
		Tortoise.penDown();
		crazy();

		// 3. Set the size of the star to 30.

		/** THE CHALLENGE: **/
		/*
		 * Make the Tortoise draw a line of stars like this:
		 * http://bit.ly/walk-of-fame
		 * 
		 * Hint: The distance between stars is 50.
		 */

	}

}
