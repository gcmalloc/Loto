package GUI;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.border.Border;


public class NumberBoard extends JPanel{
	private static final long serialVersionUID = 1L;
	private final int rowNumber;
	private NumbersSubPanel[] numbers;
	
	public NumberBoard(int row) {
		super();
		this.setBackground(new Color(0,191,255));
		Border border = BorderFactory.createEmptyBorder(5, 5, 5, 5);
		this.setBorder(border);
		this.rowNumber = row;
		GridLayout layout = new GridLayout(row,(int)Math.floor(90/(double)rowNumber));
		layout.setVgap(5);
		layout.setHgap(5);
		this.setLayout(layout);
		this.buildPanel();
		this.repaint();
		this.setVisible(true);
	}
	
	private void buildPanel() {
		this.numbers = new NumbersSubPanel[99];
		for (int i = 1;i <91;i++) {
			NumbersSubPanel actualNumberPanel = new NumbersSubPanel(i);
			this.numbers[i-1] = actualNumberPanel;
			this.add(actualNumberPanel);
		}
	}
	
	public void setNumber(boolean active, int number) {
		this.numbers[number-1].setActive(active);
	}
}
