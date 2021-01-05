package _04_HangMan;

import javax.swing.JOptionPane;

public class HangMan {
	String userInput;
	int intUserInput;
	HangMan(){
		
	}
	public static void main(String[] args) {
		HangMan hangMan = new HangMan();
		hangMan.run();


	}
	
	void run() {
		userInput = JOptionPane.showInputDialog("Enter a number from 1-266");
		intUserInput = Integer.parseInt(userInput);
	}

}
