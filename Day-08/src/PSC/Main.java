//package PSC;
//
//public class Main {
//	
//	private static Person generatePerson(Person p) {
//		if(p instanceof Student) {
//			Student student = new Student("Ankit", "Male", 123, "JA111", 300000, new Address("Chennai", "TN", "60001"));
//			return student;
//		}else if(p instanceof Instructor) {
//			Instructor instructor = new Instructor(456, 45612, new Address("Chennai", "TN", 60001));
//			return instructor;
//		}
//		return null;
//	}
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Person newStudent = generatePerson(new Student());
//		
//		Person newTeacher = generatePerson(new Instructor());
//		
//		System.out.println(newStudent);
//		System.out.println(newTeacher);
//	}
//
//
//
//}
