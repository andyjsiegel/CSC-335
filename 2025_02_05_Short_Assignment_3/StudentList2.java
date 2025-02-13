import java.util.ArrayList;

public class StudentList2 {
	private ArrayList<Student> list;
	
	public StudentList2() {
		list = new ArrayList<Student>();
	}
	
	public void addStudent(Student stu) {
		this.list.add(stu);
	}
	
	public Student getStudent(int i) {
		return this.list.get(i);
	}
}
