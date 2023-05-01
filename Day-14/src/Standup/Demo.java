package Standup;
import java.util.*;
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> list = new ArrayList<>();
		
		list.add(new Employee("Ankit", 25, 150000.0));
		list.add(new Employee("Sanket", 26, 25000.0));
		list.add(new Employee("Balu", 27, 35000.0));
		list.add(new Employee("Ravi", 29, 10000.0));
		
		
//		Collections.sort(list, new Comparator<Employee>() {
//
//			@Override
//			public int compare(Employee o1, Employee o2) {
//				if(o1.salary!=o2.salary) {
//					return Double.compare(o2.salary, o1.salary);
//				}else if(o1.age!=o2.age) {
//					return Integer.compare(o1.age, o2.age);
//				}else {					
//					return o1.name.compareTo(o2.name);
//				}
//			}
//			
//		}); 
		
		//another way
		Collections.sort(list, new SortEmp());
		
		for(Employee e : list) {
			System.out.println(e);
		}
	}

}
