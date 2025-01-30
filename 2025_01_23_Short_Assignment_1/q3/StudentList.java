import java.util.ArrayList;

public class StudentList {
    private ArrayList<Student> list;

    public StudentList() {
        this.list = new ArrayList<Student>();
    }

    public void addStudent(Student stu) {
        this.list.add(stu);
    }

    public Student getStudent(int i) {
        if (i < 0 || i >= list.size())
            return null;
        return list.get(i);
    }

    public int numStudents() {
        return list.size();
    }
}
