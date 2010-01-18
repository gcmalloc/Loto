import java.awt.Graphics;

import javax.swing.JPanel;


public class NumberBoard extends JPanel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final int rowNumber; 	
	
	public NumberBoard(int row) {
		super();
		this.rowNumber = row;
		this.setVisible(true);
	}
	
	private void paintNumber(Graphics arg0) {
		int numberToPaint = 1;
		int spaceBetweenRow = this.getWidth() / rowNumber;
		int actualMargin = spaceBetweenRow;
		int actualHeight = 10;
		while (numberToPaint < 10) {
			actualMargin = ((spaceBetweenRow % this.rowNumber) + 1) * spaceBetweenRow;
			
			arg0.drawString(new Integer(numberToPaint).toString(), actualMargin, actualHeight);
		}
	}
	
	@Override
	public void paint(Graphics arg0) {
		paintNumber(arg0);
		super.paint(arg0);
	}
}
