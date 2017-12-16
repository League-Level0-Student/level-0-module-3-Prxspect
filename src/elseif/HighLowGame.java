//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import java.util.Random;

import javax.swing.JOptionPane;

public class HighLowGame {

	public static void main(String[] args) {
		// 3. Change this line to give you a random number between 1 - 100. 
		int random = new Random().nextInt(101);
		// 2. Print out the random variable above
		
		// 11. do the following 10 times
		
			// 1. ask the user for a guess using a pop-up window, and save their response 
String numGuess=JOptionPane.showInputDialog("Im thinking of a number between 1-100. Try to guess what number it is.");
			// 4. convert the users’ answer to an int (Integer.parseInt(string))
			int num=Integer.parseInt(numGuess);
			// 5. if the guess is correct
			if (num==random) {
				JOptionPane.showMessageDialog(null, "That's correct!");
			}
			// 7. if the guess is high
			else if (num > random) {
				JOptionPane.showMessageDialog(null, "Too High");
			}
				// 8. tell them it's too high
			// 9. if the guess is low
			else if (num < random) {
				JOptionPane.showInternalMessageDialog(null, "Too Low");
			}

		// 12. tell them they lose
	}

}


