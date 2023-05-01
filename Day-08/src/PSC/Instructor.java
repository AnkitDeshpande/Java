package PSC;

public class Instructor extends Person{
	

	private static Address a1;
	int instructorId;
	int salary;
	
	public Instructor(String name, String gender, int instructorId, int salary) {
		super(name, gender, a1);
		this.instructorId = instructorId;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Instructor [instructorId=" + instructorId + ", salary=" + salary + "]";
	}
	
	
	
}
