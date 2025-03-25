import java.time.LocalDate;
import java.util.ArrayList;

public class StudentList {
	private ArrayList<Student> students;
	
	public StudentList() {
		this.students = new ArrayList<Student>();
	}
	
	public void addStudent(String fn, String ln, LocalDate bd) {
		this.students.add(new Student(fn, ln, bd));
	}
}
