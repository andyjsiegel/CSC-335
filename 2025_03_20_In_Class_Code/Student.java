import java.time.LocalDate;
import java.time.Period;

public class Student {
	private String firstName;
	private String lastName;
	private LocalDate birthDate;
	
	public Student(String firstName, String lastName, LocalDate birthDate) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDate = birthDate;
	}
	
	public int getAge() {
		LocalDate today = LocalDate.now();
		Period between = Period.between(this.birthDate, today);
		return between.getYears();
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}
