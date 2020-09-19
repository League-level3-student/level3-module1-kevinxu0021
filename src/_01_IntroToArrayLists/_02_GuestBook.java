package _01_IntroToArrayLists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.text.StyledEditorKit.ForegroundAction;

public class _02_GuestBook implements ActionListener {
	// Create a GUI with two buttons. One button reads "Add Name" and the other
	// button reads "View Names".
	// When the add name button is clicked, display an input dialog that asks the
	// user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a
	// message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	JFrame frame;
	JPanel panel;
	JButton button1;
	JButton button2;

	ArrayList<String> arrayList = new ArrayList<String>();
	int[] index = new int[0];

	_02_GuestBook() {
		frame = new JFrame();
		panel = new JPanel();
		button1 = new JButton("Add Name");
		button2 = new JButton("View Names");
	}

	public static void main(String[] args) {
		_02_GuestBook constructor = new _02_GuestBook();
		constructor.addGUI();
	}

	public void addGUI() {
		button1.addActionListener(this);
		button2.addActionListener(this);

		frame.add(panel);
		panel.add(button1);
		panel.add(button2);
		frame.setVisible(true);
		frame.pack();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton buttonPressed = (JButton) e.getSource();
		if (buttonPressed == button1) {
			String userInput = JOptionPane.showInputDialog("Enter a Name");
			arrayList.add(userInput);

		} else if (buttonPressed == button2) {
			String a = "";
			for (int i = 0; i < arrayList.size(); i++) {
				a = a + "Guest #" + (i + 1) + ": " + arrayList.get(i) + "\n";
			}
			JOptionPane.showMessageDialog(null, a);

		}
	}

}
