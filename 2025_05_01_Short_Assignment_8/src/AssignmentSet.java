import java.util.ArrayList;

public class AssignmentSet implements Gradeable {
	private ArrayList<Integer> gradeList;
	private double pointsPerItem;
	private String name;
	private double weight;
	
	public AssignmentSet(String name, double pointsPerItem, double weight) {
		this.gradeList = new ArrayList<Integer>();
		this.name = name;
		this.pointsPerItem = pointsPerItem;
		this.weight = weight;
	}
	
	public void addGrade(int grade) {
		this.gradeList.add(grade);
	}
	
	@Override
	public double getWeight() {
		return this.weight;
	}
	
	@Override
	public double average() {
		int sum = 0;
		for(Integer i : gradeList) {
			sum += i;
		}
		return sum/(gradeList.size()*pointsPerItem)*100;
	}

	@Override
	public Gradeable copy() {
		AssignmentSet copy = new AssignmentSet(this.name, this.pointsPerItem, this.weight);
		for(Integer i : gradeList) {
			copy.addGrade(i);
		}
		return copy;
	}
}
