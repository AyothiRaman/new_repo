package developersKnow;

import developersKnow.Employee.Student.Teacher;

class Employee{
	
	class Student{
		
		void hmm() {
			System.out.println("inner method");
		}
		
		class Teacher{
			
			void hell() {
				
				System.out.println("inner inner method");
			}
		}
		
	}
}

public class InnerInnerClass {

	public static void main(String[] args) {
		
		Employee emp = new Employee();
		
		Employee.Student stu = emp.new Student();
		
		stu.hmm();
		
		Employee.Student.Teacher tech = stu.new Teacher();
		
		tech.hell();

	}

}
