package mvc;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class DecimalLabel extends JLabel implements Observer {
	
	public DecimalLabel() {
		super("Decimal: " + Integer.toString(0),JLabel.LEFT);
		this.setSize(250,100);
	}
	
	public void newNumber(int num) {
		this.setText("Decimal: " + Integer.toString(num));
	}
}
