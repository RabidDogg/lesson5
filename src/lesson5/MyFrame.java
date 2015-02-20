package lesson5;

import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame extends JFrame {

	public MyFrame(int size) {
		MyPanel panel = new MyPanel();
		Container container = getContentPane();
		container.add(panel);

		setBounds(100, 100, size, size);
		setVisible(true);
	}
}

class MyPanel extends JPanel {

	@Override
	public void paintComponent(Graphics gr) {
		drawBackground(gr);
		drawNumber(gr);

	}

	private void drawBackground(Graphics gr) {
		gr.setColor(Color.BLACK);
		gr.fillRect(0, 0, 500, 500);
	}

	private void drawNumber(Graphics gr) {
		gr.setColor(Color.WHITE);
		gr.drawLine(60, 10, 60, 200);
        gr.drawLine(60, 10, 20, 60);
        gr.drawLine(80, 10, 80, 200);
        gr.drawLine(80, 10, 160, 10);
        gr.drawLine(80, 100, 160, 100);
        gr.drawLine(80, 200, 160, 200);
        gr.drawLine(160, 100, 160, 200);
        gr.drawLine(170, 200, 170, 200);
        gr.drawLine(200, 10, 200, 200);
        gr.drawLine(200, 10, 160, 60);
        gr.drawLine(250, 10, 250, 200);
        gr.drawLine(250, 10, 210, 60);
        gr.drawLine(260, 200, 260, 200);
        gr.drawLine(360, 10, 360, 200);
        gr.drawLine(360, 10, 290, 10);
        gr.drawLine(290, 10, 290, 110);
        gr.drawLine(290, 110, 360, 110);
        gr.drawLine(360, 200, 290, 200);
        gr.drawLine(460, 10, 420, 200);
        gr.drawLine(460, 10, 380, 10);
      
	}
}

	

	


