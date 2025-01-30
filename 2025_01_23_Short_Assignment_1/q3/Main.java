public class Main {
	public static void main(String[] args) {
		StudentList list = new StudentList();
		Student stu1 = new Student("Alice", "Anderson", 18);
		Student stu2 = new Student("Bob", "Banner", 19);
		Student stu3 = new Student("Carl", "Carlson", 17);

		list.addStudent(stu1);
		list.addStudent(stu2);
		list.addStudent(stu3);

		stu1.setFirstName("Alicia");
		stu2.incrementAge();
		stu3 = new Student("Dave", "Davidson", 20);
		int age_bob = stu2.getAge();
		age_bob++;

		Student stu4 = list.getStudent(0);
		Student stu5 = list.getStudent(1);
		Student stu6 = list.getStudent(2);
		stu5.setLastName("Brown");
		addNewStudent(list, stu1, "Elsa", "Edwards", 19);

		System.out.println(stu1);
		System.out.println(stu2);
		System.out.println(stu3);
		System.out.println(stu4);
		System.out.println(stu5);
		System.out.println(stu6);

		System.out.println(list.numStudents());
	}

	private static void addNewStudent(StudentList list, Student stu, String fn, String ln, int age) {
		stu = new Student(fn, ln, age);
		list.addStudent(stu);
	}
}
