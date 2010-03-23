package GUI;

import java.awt.Dimension;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import listener.MainListener;

public class CommandCheckPanel extends CommandPanel {
	private static final long serialVersionUID = -2448162704082583568L;
	private JLabel dejaTire = new JLabel("JAMAIS");
	private JTextField nombre;
		
	public CommandCheckPanel(LotoWindow mainWindow) {
		super();
		MainListener listener = MainListener.getInstance(mainWindow);
		JButton verifier = new JButton("verifier");
		verifier.addActionListener(listener);
		verifier.setAlignmentX(CENTER_ALIGNMENT);
		verifier.setPreferredSize(new Dimension(75, 75));
		verifier.setMaximumSize(new Dimension(75, 75));
		this.add(verifier);
		this.add(Box.createVerticalStrut(5));
		this.nombre = new JTextField(5);
		this.nombre.setHorizontalAlignment(SwingConstants.CENTER);
		this.nombre.setMaximumSize(new Dimension(50, 10));
		this.add(Box.createVerticalStrut(2));
		this.nombre.setAlignmentX(CENTER_ALIGNMENT);
		this.add(this.nombre);
		this.add(Box.createVerticalGlue());
		dejaTire.setFont(this.messageFont);
		dejaTire.setAlignmentX(CENTER_ALIGNMENT);
		this.add(dejaTire);
		JLabel tir = new JLabel("TIRE");
		tir.setFont(this.messageFont);
		tir.setAlignmentX(CENTER_ALIGNMENT);
		this.add(tir);
		this.add(Box.createVerticalGlue());
		
		JButton tire = new JButton("TIRER");
		tire.addActionListener(listener);
		tire.setAlignmentX(CENTER_ALIGNMENT);
		tire.setPreferredSize(new Dimension(75, 75));
		tire.setMaximumSize(new Dimension(75, 75));
		this.add(tire);
	}
	
	public void dejaTire(boolean tire) {
		if (tire)
			this.dejaTire.setText("DEJA");
		else
			this.dejaTire.setText("JAMAIS");
	}
	
	public String getCheckText() {
		String retour = this.nombre.getText();
		return retour;
	}
	
	public void setCheckText(String toDisplay) {
		this.nombre.setText(toDisplay);
	}
}
