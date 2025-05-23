package main.model;

import java.util.ArrayList;
import java.util.Comparator;

import main.view.CourseDashboard;

public class Student extends User {
	
    private ArrayList<Course> coursesTaken;
    private ArrayList<StudentGradebook> gradebooks;
    
    public Student(String username, String password, String firstName, String lastName, String email, boolean isHashed) {
        super(username, password, firstName, lastName, email, isHashed);
		coursesTaken = new ArrayList<Course>();
		gradebooks = new ArrayList<StudentGradebook>();
    }

	//copy constructor
    public Student(Student other) {
        super(other.username, other.password, other.firstName, other.lastName, other.email,true);
    }

	public ArrayList<Assignment> getAllAssignments() {
		ArrayList<Assignment> studentAssignments = new ArrayList<Assignment>();
		for (StudentGradebook gradebook : gradebooks) {
			studentAssignments.addAll(gradebook.getAssignments());
		}
		return studentAssignments;
	}

	public StudentGradebook getGradebookForCourse(Course course) {
		return gradebooks.get(coursesTaken.indexOf(course));
	}

	public void addCourse(Course course) {
		System.out.println("Added course " + course.getName() + " to student " + this.firstName + " " + this.lastName);
		coursesTaken.add(course);
		gradebooks.add(new StudentGradebook(course));  // pass the Course
	}


	public static Comparator<Student> sortByFirstName() {
		return new Comparator<Student>() {
			public int compare(Student s1, Student s2) {
				int nameCompare = s1.firstName.compareToIgnoreCase(s2.firstName);
				return nameCompare;
			}
		};
	}

	public static Comparator<Student> sortByLastName() {
		return new Comparator<Student>() {
			public int compare(Student s1, Student s2) {
				int nameCompare = s1.lastName.compareToIgnoreCase(s2.lastName);
				return nameCompare;
			}
		};
	}
	
	public static Comparator<Student> sortByUsername() {
		return new Comparator<Student>() {
			public int compare(Student s1, Student s2) {
				int nameCompare = s1.username.compareToIgnoreCase(s2.username);
				return nameCompare;
				}
		};
	}

	public static Comparator<Student> sortByGradeOnAssignment(String assignmentName) {
	    return new Comparator<Student>() {
	        @Override
	        public int compare(Student s1, Student s2) {
	            Assignment a1 = s1.getAssignmentByName(assignmentName);
	            Assignment a2 = s2.getAssignmentByName(assignmentName);
	            // -1 is students withotu grades 
	            double grade1 = (a1 != null) ? a1.getGrade() : -1.0; 
	            double grade2 = (a2 != null) ? a2.getGrade() : -1.0;

	            return Double.compare(grade1, grade2);
	        }
	    };
	}

	

	public Assignment getAssignmentByName(String assignmentName) {
		for (Assignment assignment : getAllAssignments()) {
			if (assignment.getTitle().equals(assignmentName)) {
				return assignment;
			}
		}
		return null;
	}

	public String getFullName() {
		return this.firstName + " " + this.lastName;
	}

	@Override
	public String toString() {
		return "Student " + this.firstName + " " + this.lastName + " with username " + username;
	}
    
	public ArrayList<Course> getCoursesForDay(Days day) {
        ArrayList<Course> courses = new ArrayList<Course>();
        for (Course course : this.coursesTaken) {
            if (course.getDays().contains(day)) {
                courses.add(course);
            }
        }
        return courses;
        
    }

	public ArrayList<Course> getCourses() {
		return coursesTaken;
	}

	public Double getFinalGradeForCourse(CourseDashboard course) {
		int index = coursesTaken.indexOf(course);
		if (index != -1) {
			return gradebooks.get(index).calculateFinalGrade();
		}
		return null; // Return null if the course is not found
	}

	public void setFinalGradeForCourse(Course course, String gradeStr) {
	    int index = coursesTaken.indexOf(course);
	    if (index == -1) {
	        System.out.println("Course not found for the student.");
	        return;
	    }

	    try {
	        // Convert the user’s input ("A", "b", etc.) into the enum
	        FinalGrades fg = FinalGrades.valueOf( gradeStr.trim().toUpperCase() );
	        gradebooks.get(index).setFinalGrade(fg);
	    } catch (IllegalArgumentException e) {
	        System.out.println("Invalid final‐grade value: “" + gradeStr + "”. Use A, B, C, D, or E.");
	    }
	}
}