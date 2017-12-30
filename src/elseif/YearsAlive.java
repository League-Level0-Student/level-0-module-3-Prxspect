package elseif;

import javax.swing.JOptionPane;

public class YearsAlive {
public static void main(String[] args) {
	
	String answer= JOptionPane.showInputDialog("What year were you born?");
	int YearBorn = Integer.parseInt(answer);
String answer2 =JOptionPane.showInputDialog("How many years have you lived currently?");
int YearsAlive = Integer.parseInt(answer2);
System.out.println(YearBorn);
for (int i = 0; i < YearsAlive; i++) {
	System.out.println(YearBorn += 1);
}
}
}
