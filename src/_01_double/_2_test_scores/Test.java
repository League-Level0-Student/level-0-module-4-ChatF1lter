package _01_double._2_test_scores;

import javax.swing.JOptionPane;

public class Test {
public static void main(String[] args) {
String score = JOptionPane.showInputDialog("What did you get on your last test?");
int scoreNumber = Integer.parseInt(score);
if(scoreNumber<101 && scoreNumber>=90) {
	JOptionPane.showMessageDialog(null, "Good job! You got a good score!");
} else if(scoreNumber<=89 && scoreNumber>79) {
	JOptionPane.showMessageDialog(null, "That's a pretty good score! Only a small need for improvement");
} else if(scoreNumber<=79 && scoreNumber>69) {
JOptionPane.showMessageDialog(null, "That's an OK score, but you could've done better.");
} else if(scoreNumber<=69 && scoreNumber>59) {
	JOptionPane.showMessageDialog(null, "That's a pretty mid score, should've just studied better.");
} else if(scoreNumber<=59 && scoreNumber>-1) {
	JOptionPane.showMessageDialog(null, "Drop out fr");
}
}
}