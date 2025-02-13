import java.util.ArrayList;

public class StudentList3 {
	private ArrayList<Student> students;
	
	public StudentList3() {
		this.students = new ArrayList<Student>();
	}
	
	public ArrayList<String> getStudents() {
		ArrayList<String> names = new ArrayList<String>();
		for(Student s : students) {
			names.add(s.toString());
		}
		return names;
	}
	
	public void addStudent(String fn, String ln, int age) {
		this.students.add(new Student(fn, ln, age));
	}
}
