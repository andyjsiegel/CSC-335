public class StudentMain {
    public static void main(String[] args) {
        StudentList2 list2 = new StudentList2();
        list2.addStudent(new Student("Andy", "Siegel", 19)); // not optimal
        // i want to retrieve me; what index??
        list2.getStudent(0);
    }
}
