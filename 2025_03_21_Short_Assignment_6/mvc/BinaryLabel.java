package mvc;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class BinaryLabel extends JLabel implements Observer {
	
	public BinaryLabel() {
		super("", JLabel.CENTER);
		this.setText("Binary: " + convert(0));
		this.setSize(250,100);
	}
	
	@Override
	public void newNumber(int num) {
		this.setText("Binary: " + convert(num));
	}
	
	private String convert(int num) {
		if(num < 2)
			return Integer.toString(num);
		int q = num / 2;
		int r = num % 2;
		return convert(q) + convert(r);
	}
}
