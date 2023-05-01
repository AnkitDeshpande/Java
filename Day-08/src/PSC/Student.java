package PSC;

public class Student extends Person{
	
	private static Address a1;
	int studentId;
	String courseEnrolled;
	int courseFee;

	public Student(String name, String gender, int studentId, String courseEnrolled, int courseFee) {
		super(name, gender, a1);
		this.studentId = studentId;
		this.courseEnrolled = courseEnrolled;
		this.courseFee = courseFee;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", courseEnrolled=" + courseEnrolled + ", courseFee=" + courseFee
				+ "]";
	}
	
	
	
}
