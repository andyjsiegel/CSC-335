import java.util.Random;

public class CompositeMain {
	public static void main(String[] args) {
		/* main categories: quizzes (10%), finalProject (20%),
		exams (50%), homework (20%) */
		AssignmentSet quizzes = new AssignmentSet("Quizzes", 10, 10);
		Assignment finalProject = new Assignment("Final Project", 100, 20);
		AssignmentSet exams = new AssignmentSet("Exams", 100, 50);
		AssignmentSet homework = new AssignmentSet("Homework", 20, 20);
		
		/* adding individual assignments & grades */
		Random gen = new Random();
		for(int i = 0; i < 10; i++)
			quizzes.addGrade(gen.nextInt(15));
		
		finalProject.setGrade(87);
		
		exams.addGrade(65);
		exams.addGrade(78);
		exams.addGrade(94);
		
		for(int i = 0; i < 12; i++) {
			homework.addGrade(gen.nextInt(25));
		}
		
		System.out.println("Quiz average: " + quizzes.average());
		System.out.println("Final Project: " + finalProject.average());
		System.out.println("Exams: " + exams.average());
		System.out.println("Homework: " + homework.average());
		
		/* Setting up full class */
		CompositeGradeable classTotal = new CompositeGradeable();
		classTotal.addGradeable(quizzes);
		classTotal.addGradeable(finalProject);
		classTotal.addGradeable(exams);
		classTotal.addGradeable(homework);
		
		System.out.println("Class average: " + classTotal.average());
	}
}
