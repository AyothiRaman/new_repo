package practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Vector{
	public static void main(String[] args) {
		
		List<Person> list = new ArrayList<>();
		
			list.add(new Person(1,"kk"));
			
		for (Person person : list) {
			System.out.println(person.getName()+ person.school);
		}
		
		
		
	
}
}

class Person{
	int name;
	String school;
	
	public Person(int name, String school) {
	//	super();
		this.name = name;
		this.school = school;
	}

	
	
	

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}
	
	
	public int getName() {
		return name;
	}

	public void setName(int name) {
		this.name = name;
	}


	
	
	
}