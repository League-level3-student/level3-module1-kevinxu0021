package _04_HangMan;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class HangMan implements ActionListener, KeyListener {
	String userInput;
	int intUserInput;
	Stack<String> stack = new Stack<String>();
	Utilities utilities;
	boolean rerun = true;
	JFrame frame;
	JPanel panel;
	JLabel label;
	JLabel lifeLabel;
	int life = 20;
	String word;

	HangMan() {
		utilities = new Utilities();
	}

	public static void main(String[] args) {
		HangMan hangMan = new HangMan();
		hangMan.run();
		hangMan.gui();
		hangMan.guess();
	}

	void run() {
		userInput = JOptionPane.showInputDialog("Enter a number from 1-266");
		intUserInput = Integer.parseInt(userInput);
		while (stack.size() < intUserInput) {
			String temp = utilities.readRandomLineFromFile("dictionary.txt");
			if (!stack.contains(temp)) {
				stack.add(temp);
			}
		}
		System.out.println(stack);

	}

	void gui() {
		frame = new JFrame();
		frame.addKeyListener(this);
		panel = new JPanel();
		label = new JLabel();
		lifeLabel = new JLabel();
		frame.add(panel);
		panel.add(lifeLabel);
		panel.add(label);
		lifeLabel.setText("Life left:" + life);
		frame.setVisible(true);
		frame.setSize(300, 500);
	}

	void guess() {
		word = stack.pop();
		int letters;
		String displayText = "_";
		String tempText = "_";
		letters = word.length();
		for (int i = 0; i < letters - 1; i++) {
			displayText = tempText + "_";
			tempText = displayText;
		}
		label.setText(displayText);

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		char typedChar;
		typedChar = e.getKeyChar();
		System.out.println(typedChar);
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

}
