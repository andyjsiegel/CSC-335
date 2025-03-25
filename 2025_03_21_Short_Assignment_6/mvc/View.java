package mvc;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class View extends JFrame{
	private DecimalLabel decimalLabel;
	private BinaryLabel binaryLabel;
	private Controller controller;
	
	
	public View() {
		this.controller = new Controller(new Model());
		this.setTitle("MVC Demo");
		this.setSize(400,400);
		this.setUp();
	}
	
	private void setUp() {
		//set up the two panels
		decimalLabel = new DecimalLabel();
		binaryLabel = new BinaryLabel();
		this.add(decimalLabel);
		this.add(binaryLabel);
		controller.addObserver(decimalLabel);
		controller.addObserver(binaryLabel);
		
		//setting up the main panel
		JPanel mainPanel = new JPanel();
		this.add(mainPanel);
		
		//setting up the switch button
		JButton incButton = new JButton("increment");
		incButton.setActionCommand("inc");
		incButton.addActionListener(controller);
		mainPanel.add(incButton);
		
		//setting up the count button
		JButton decButton = new JButton("decrement");
		decButton.setActionCommand("dec");
		decButton.addActionListener(controller);
		mainPanel.add(decButton);
		
		//adding a window listener for closing the app
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent windowEvent) {
				System.exit(0);
			}
		});
		
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		View view = new View();
	}
}
