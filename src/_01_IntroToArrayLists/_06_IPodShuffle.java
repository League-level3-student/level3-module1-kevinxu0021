package _01_IntroToArrayLists;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

//Copyright The League of Amazing Programmers, 2015

public class _06_IPodShuffle implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton("Suprise Me!");
	ArrayList<String> songs = new ArrayList<String>();
	Song player;
	Random random = new Random();
	int a = 0;

	public _06_IPodShuffle() {
		// 1. Use the Song class the play the demo.mp3 file.

		/**
		 * 2. Congratulations on completing the sound check! * Now we want to make an
		 * iPod Shuffle that plays random music. * Create an ArrayList of Songs and a
		 * "Surprise Me!" button that will play a random song when it is clicked. * If
		 * you're really cool, you can stop all the songs, before playing a new one on
		 * subsequent button clicks.
		 */

	}

	public static void main(String[] args) {

		_06_IPodShuffle a = new _06_IPodShuffle();
		a.addSongs();
		a.run();

	}

	public void run() {
		frame.add(panel);
		panel.add(button);
		button.addActionListener(this);
		frame.setVisible(true);
		frame.setResizable(false);
		frame.pack();
	}

	public void addSongs() {
		for (int i = 1; i < 28; i++) {
			songs.add(" (" + i + ").mp3");
		}

	}

	public void play() {

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub

		if (a > 0) {
			player.stop();
		}
		player = new Song(songs.get(random.nextInt(songs.size())));
		player.play();
		a++;

	}
}