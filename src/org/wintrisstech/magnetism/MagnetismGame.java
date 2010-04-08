package org.wintrisstech.magnetism;

import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class MagnetismGame extends JComponent implements Runnable {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new MagnetismGame());
	}
	
	public void run() {
		
		JFrame window = new JFrame("Magnetism");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.add(this);
		window.pack();
		window.setLocationRelativeTo(null); // This centers the window
		window.setVisible(true);
	}
	
	@Override
	public Dimension getPreferredSize() {
		return new Dimension(800, 600);
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		
	}

}
