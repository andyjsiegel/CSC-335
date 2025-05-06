public class Assignment implements Gradeable {
	private double pointsPossible;
	private double pointsEarned;
	private double weight;
	private String name;
	
	public Assignment(String name, double pointsPossible, double weight) {
		this.name = name;
		this.pointsPossible = pointsPossible;
		this.weight = weight;
	}

	public void setGrade(int grade) {
		this.pointsEarned = grade;
	}

	@Override
	public double average() {
		return this.pointsEarned/this.pointsPossible * 100.0;
	}

	@Override
	public double getWeight() {
		return this.weight;
	}

	@Override
	public Assignment copy() {
		Assignment copy = new Assignment(this.name, this.pointsPossible, this.weight);
		copy.pointsEarned = this.pointsEarned;
		return copy;
	}
}
