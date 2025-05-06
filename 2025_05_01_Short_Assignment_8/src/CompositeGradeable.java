import java.util.ArrayList;

public class CompositeGradeable implements Gradeable {
	private ArrayList<Gradeable> grades;
	
	public CompositeGradeable() {
		this.grades = new ArrayList<Gradeable>();
	}
	
	public void addGradeable(Gradeable gradeable) {
		this.grades.add(gradeable.copy());
	}
	
	@Override
	public double average() {
		double sumPercents = 0.0;
		for(Gradeable g : grades) {
			sumPercents += g.average()/100.0*g.getWeight();
		}
		return sumPercents/getWeight()*100;
	}

	@Override
	public double getWeight() {
		double sumWeights = 0.0;
		for(Gradeable g : grades) {
			sumWeights += g.getWeight();
		}
		return sumWeights;
	}

	@Override
	public CompositeGradeable copy() {
		CompositeGradeable copy = new CompositeGradeable();
		for(Gradeable g : grades)
			copy.addGradeable(g.copy());
		return null;
	}
}
