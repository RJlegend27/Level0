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

	public static void main(String[] args) {

		// 1. Set the X position of the Tortoise so that it starts on the left.
		Tortoise.show();
		Tortoise.setX(50);
		// You also need to show the Tortoise to see the result of this line.
		Tortoise.setSpeed(10);
		// 2. Make the Tortoise draw a star shape. Hint: 144.
		Tortoise.penDown();
		Tortoise.setPenWidth(15);
		starU();

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
