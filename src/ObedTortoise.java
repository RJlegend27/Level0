import java.awt.Color;

import javax.swing.JOptionPane;

import org.teachingextensions.logo.Tortoise;

public class ObedTortoise {
	public static void main(String[] args) {
		Tortoise.setSpeed(10);
		Tortoise.setPenColor(Color.CYAN);
		Tortoise.show();
		String shape = JOptionPane.showInputDialog("What shape do you want?!");
		if (shape.equals("triangle") ){
			drawTriangle();
		}
		if (shape.equals("circle") ){
			drawCircle();
		}
		if (shape.equals("square") ){
			drawSquare();
		}
		// We are going to make an obedient tortoise that will obey our commands
		// to draw shapes. Please note that this
		// is not a recipe, but a list step-by-step instructions.

		// 1. Make a new class, create a main method, and show the tortoise.

		// 2. Have the Tortoise draw a square.

		// 3. Extract this code into a drawSquare() method.

		// 4. Have the Tortoise draw a triangle.

		// 5. Extract this code into a drawTriangle() method.

		// 6. Have the Tortoise draw a circle.
		drawCircle();
		// 7. Extract this code into a drawCircle() method.

		// 8. Ask the user which shape they want. Draw the appropriate shape
		// depending on their answer.

		// 9. Ask the user which color they want. Color the the shape depending
		// on their answer.
	}

	static void drawTriangle() {
		Tortoise.move(80);
		Tortoise.turn(120);
		Tortoise.move(80);
		Tortoise.turn(120);
		Tortoise.move(80);
	}

	static void drawCircle() {
		for (int i = 0; i < 361; i++) {
			Tortoise.move(1);
			Tortoise.turn(1);
		}
	}

	static void drawSquare() {
		Tortoise.move(50);
		Tortoise.turn(90);
		Tortoise.move(50);
		Tortoise.turn(90);
		Tortoise.move(50);
		Tortoise.turn(90);
		Tortoise.move(50);
	}
}