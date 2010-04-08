package org.wintrisstech.magnetism;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.Stroke;

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
		Graphics2D g2 = (Graphics2D) g;
		drawParticle(g2, 100, 100);
		drawMagnet(g2, 400, 300);
	}

	private void drawMagnet(Graphics2D g2, int x, int y) {
		g2.setStroke(new BasicStroke(10));
		g2.setColor(new Color(255, 180, 40));
		g2.drawOval(x - 25, y - 25, 50, 50);
		g2.setColor(new Color(255, 200, 60));
		g2.fillOval(x - 25, y - 25, 50, 50);
	}

	private void drawParticle(Graphics2D g2, int x, int y) {
		g2.setColor(Color.BLACK);
		g2.fillOval(x - 25, y - 25, 50, 50);
		g2.setColor(Color.BLUE);
		g2.setStroke(new BasicStroke(3));
		g2.drawOval(x - 25, y - 25, 50, 50);
	}

}
