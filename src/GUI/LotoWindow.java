package GUI;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JFrame;


public class LotoWindow extends JFrame {
	private static final long serialVersionUID = 4788836860280588325L;

	private final int rowNumber = 10;
	
	private GenCommandPanel command;
	private NumberBoard number;
	
	public LotoWindow() {
		this.command = new GenCommandPanel(this);
		this.setSize(400,400);
		this.setMinimumSize(new Dimension(400,400));
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		BorderLayout layout = new BorderLayout();
		this.setLayout(layout);
		this.add(command, BorderLayout.WEST);
		WindowMenuBar menu = new WindowMenuBar(this);
		this.setJMenuBar(menu);
		
		this.number = new NumberBoard(rowNumber);
		this.add(number);
		this.setVisible(true);
	}
	public void setNumber(boolean active, int number) {
		this.number.setNumber(active, number);
	}
	public void newGame() {
		this.number = new NumberBoard(rowNumber);
	}
	public void changeCommand() {
		this.command.layout.next(this.command);
		return;
	}
	public String getCheckText() {
		String retour = this.command.getCheckText();
		return retour;
	}
	
	public void setCheckText(String text) {
		this.command.setCheckText(text);
	}
	public void setNumerosTire(int i) {
		this.command.setNumerosTire(i);
	}
	public void setTire(boolean tire) {
		this.command.setTire(tire);
	}
}
