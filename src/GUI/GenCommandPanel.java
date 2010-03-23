package GUI;

import java.awt.CardLayout;

import javax.swing.JPanel;

public class GenCommandPanel extends JPanel{
	private static final long serialVersionUID = -2913170479675497796L;
	public CardLayout layout;
	private CommandCheckPanel checkPanel;
	private CommandTirePanel tirePanel;
	
	
	public GenCommandPanel(LotoWindow mainWindow) {
		this.layout = new CardLayout();
		this.layout.addLayoutComponent(new CommandCheckPanel(mainWindow),null);
		this.setLayout(layout);
		this.checkPanel = new CommandCheckPanel(mainWindow);
		this.add(this.checkPanel);
		this.tirePanel = new CommandTirePanel(mainWindow);
		this.add(this.tirePanel);
	}
	
	public String getCheckText() {
		String retour = this.checkPanel.getCheckText();
		return retour;
	}
	
	public void setCheckText(String text) {
		this.checkPanel.setCheckText(text);
	}
	public void setNumerosTire(int i) {
		this.tirePanel.setNumeroTire(i);
	}
	public void setTire(boolean tire) {
		this.checkPanel.dejaTire(tire);
	}
}
