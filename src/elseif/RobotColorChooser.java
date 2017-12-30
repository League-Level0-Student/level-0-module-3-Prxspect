
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class RobotColorChooser {
	static Robot r2d2 = new Robot();

	public static void main(String[] args) {

		r2d2.setPenWidth(10);
		// 3. ask the user what color they would like the robot to draw
		String RobotColor = JOptionPane.showInputDialog("What color do you want your Robot to draw?");
		// 4. use an if/else statement to set the pen color that the user requested
		if (RobotColor.equals("red")) {
			r2d2.setPenColor(216, 31, 28);
		} else if (RobotColor.equals("blue")) {
			r2d2.setPenColor(23, 67, 226);
		} else if (RobotColor.equals("green")) {
			r2d2.setPenColor(28, 216, 62);
		}
		// 5. if the user doesn’t enter anything, choose a random color
		else {
			r2d2.setRandomPenColor();
		}
		// 6. put a loop around your code so that you keep asking the user for more
		// colors & drawing them
		r2d2.setPenWidth(10);
		r2d2.setSpeed(10);
		String RobotShape = JOptionPane.showInputDialog("What shape do you want your robot to draw?");
		if (RobotShape.equals("square")) {
			drawSquare();
		} else if (RobotShape.equals("triangle")) {
			drawTriangle();
		}
		// 2. set the pen width to 10

		// 1. make the robot draw a shape (this will take more than one line of code)

	}

	public static void drawSquare() {
		for (int i = 0; i < 4; i++) {
			r2d2.penDown();
			r2d2.move(200);
			r2d2.turn(90);
		}
		r2d2.sparkle();
	}

	public static void drawTriangle() {
		r2d2.penDown();
		r2d2.turn(45);
		r2d2.move(200);
		r2d2.turn(90);
		r2d2.move(200);
		r2d2.turn(135);
		r2d2.move(290);
		r2d2.sparkle();
	}

	private static void penWidth(int i) {
		// TODO Auto-generated method stub

	}
}
