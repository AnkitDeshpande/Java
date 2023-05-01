package Standup;
import java.util.*;
public class SortEmp implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		if(o1.salary!=o2.salary) {
			return Double.compare(o2.salary, o1.salary);
		}else if(o1.age!=o2.age) {
			return Integer.compare(o1.age, o2.age);
		}else {					
			return o1.name.compareTo(o2.name);
		}
	}

}
