package _03_IntroToStacks;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class _02_TextUndoRedo implements KeyListener, ActionListener {
	/*
	 * Create a JFrame with a JPanel and a JLabel.
	 * 
	 * Every time a key is pressed, add that character to the JLabel. It should look
	 * like a basic text editor.
	 * 
	 * Make it so that every time the BACKSPACE key is pressed, the last character
	 * is erased from the JLabel. Save that deleted character onto a Stack of
	 * Characters.
	 * 
	 * Choose a key to be the Undo key. Make it so that when that key is pressed,
	 * the top Character is popped off the Stack and added back to the JLabel.
	 * 
	 */
	JFrame frame;
	JPanel panel;
	JLabel label;
	char typedCharacter;
	String displayText;
	String initialText = "";
	char[] originalChar;
	char[] modifiedChar;
	Stack<String> deletedChars = new Stack<String>();

	_02_TextUndoRedo() {

	}

	public static void main(String[] args) {
		_02_TextUndoRedo exe = new _02_TextUndoRedo();
		exe.run();
	}

	public void run() {
		frame = new JFrame();
		panel = new JPanel();
		label = new JLabel();
		frame.addKeyListener(this);
		panel.add(label);
		frame.add(panel);
		frame.setSize(900, 500);
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if (e.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
			String blank = "";
			originalChar = new char[displayText.length()];
			modifiedChar = new char[displayText.length() - 1];
			originalChar = displayText.toCharArray();
			deletedChars.add(blank + originalChar[originalChar.length - 1]);
			for (int i = 0; i < modifiedChar.length; i++) {
				modifiedChar[i] = originalChar[i];
			}
			blank = "";
			if (modifiedChar.length == 0) {
				displayText = blank;
			} else {
				for (int i = 0; i < modifiedChar.length; i++) {
					displayText = blank + modifiedChar[i];
					blank = displayText;
				}
			}

			label.setText(displayText);
			initialText = displayText;
		} else if (e.getKeyCode() == KeyEvent.VK_CONTROL) {
			String currentText = displayText;
			String storage;
			storage = deletedChars.pop();
			displayText = currentText + storage;
			label.setText(displayText);
		} else {
			typedCharacter = e.getKeyChar();
			System.out.println(displayText);
			displayText = initialText + typedCharacter;
			label.setText(displayText);
			initialText = displayText;
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

}
