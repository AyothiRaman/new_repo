package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


class Employee{
	
	int empId;
	int mobilNumber;
	String location;
	
	
	public Employee(int empId, int mobilNumber, String location) {
		super();
		this.empId = empId;
		this.mobilNumber = mobilNumber;
		this.location = location;
	}
	
}

public class Hey {


	public static void main(String[] args) {
		
		ArrayList<Employee> emp = new ArrayList<Employee>();
		
		emp.add(new Employee(1,123,"chennai"));
		emp.add(new Employee(1,456,"banglore"));
		emp.add(new Employee(1,789,"chennai"));
		

		List<Integer> emp1 = emp.stream()
				.filter(p-> p.mobilNumber>123) // for filtering
				.map(p->p.mobilNumber)         // for fetching
				.collect(Collectors.toList()); // collecting as list
		
		System.out.println(emp1);

		
		strExample();
		
		
	}
	
	public static void strExample() {
		
		String name ="Ayothi";
		
		if(name.equals("Ayothi")) {
			
			System.out.println("yes");
			
		}
		else {
			System.out.println("no");
		}
	}
	
	

}
