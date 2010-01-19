package GUI;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JFrame;


public class LotoWindow extends JFrame {
	CommandPanel command;
	public LotoWindow() {
		this.setSize(400,400);
		this.setMinimumSize(new Dimension(400,400));
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		BorderLayout layout = new BorderLayout();
		this.setLayout(layout);
		
		this.command = new CommandCheckPanel();
		this.add(command, BorderLayout.WEST);
		
		Menu menu = new Menu();
		this.add(menu);
		
		NumberBoard numb = new NumberBoard(10);
		this.add(numb);
		this.setVisible(true);
	}
}
