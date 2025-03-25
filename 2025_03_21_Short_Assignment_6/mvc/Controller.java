package mvc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller implements ActionListener{
	private Model model;

	public Controller(Model model) {
		this.model = new Model();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand();
		if(command.equals("inc")) {
			model.increment();
		} else if(command.equals("dec")) {
			model.decrement();
		}
	}
	
	public void addObserver(Observer observer) {
		model.registerObserver(observer);
	}
}
