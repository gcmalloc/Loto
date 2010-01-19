package GUI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class CommandPanel extends JPanel {
		protected Font messageFont = new Font("Rasheeq",Font.PLAIN,20);
		
		public CommandPanel() {
			super();
			this.setBackground(new Color(0,191,255));
			BoxLayout layout = new BoxLayout(this, BoxLayout.Y_AXIS);
			Border border = BorderFactory.createEmptyBorder(10,10,10,10);
			this.setBorder(border);
			this.setLayout(layout);
	}
}
