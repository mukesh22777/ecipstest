package com.test.test;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Test {

	public static void main(String[] args) {

		JFrame frame = new JFrame();
		frame.setTitle("Sample Application");
		frame.setSize(900, 1000);
		frame.setVisible(true);

		JMenuBar bar = new JMenuBar();

		JMenu menu = new JMenu("File");
		JMenuItem newItem = new JMenuItem("New");
		menu.add(newItem);

		JMenuItem openItem = new JMenuItem("Open");
		menu.add(openItem);

		JMenuItem saveItem = new JMenuItem("Save");
		menu.add(saveItem);

		JMenu Edit = new JMenu("Edit");

		JMenu Source = new JMenu("Source");

		bar.add(menu);
		bar.add(Edit);
		bar.add(Source);
		frame.setJMenuBar(bar);

	}

}
