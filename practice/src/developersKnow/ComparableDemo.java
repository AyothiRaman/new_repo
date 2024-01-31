package developersKnow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Collectors;

import practice.Collection;









class Student{
	
	private static Student stu;
	
	private Student() {};
	
	public static Student hello() {
		if(stu==null) {
			stu = new Student();
		}
			return stu;
		
	}
	
	public void hel() {
		System.out.println("singleton Example");
	}
}

class Person 
//implements Comparable<Person>
{
	
	int age ;
	String name ;
	int id;
	
	public Person(int age, String name,int id) {
		
		this.age = age;
		this.name = name;
		this.id=id;
	}

	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + ", id=" + id + "]";
	}
	


//	@Override
//	public int compareTo(Person o) {
//
//		if(this.age<o.age) {
//			
//			return 1;
//		}else {
//			return -1;
//		}
//	}
	
	
}
public class ComparableDemo {

	public static void main(String[] args) {
		
	Student st =  Student.hello();
	

	st.hel();
	
	
	
	
		// TODO Auto-generated method stub
		
		Comparator<Person> comparator=(o1,o2)-> o1.name.length()>o2.name.length()?1:-1;
				
			
		
		
		List<Person> n =new ArrayList<>();
		
		
		
		n.add( new Person(1, "ayothi",10800));
		n.add( new Person(16, "ganesh",10783));
		n.add( new Person(7, "ganesh babu",1000));
		
		// example for list iterator
		System.out.println(".............");
		ListIterator<Person> per = n.listIterator();
		System.out.println( "list iterator example"+per.previousIndex());
		while(per.hasNext()) {
			System.out.println(per.next());
		}
		
		List<Person> ddd = n.stream().filter((m)->m.id>1500).collect(Collectors.toList());		
		//Collections.sort(n,comparator);
		
		System.out.println(ddd);
		//System.out.print( Collections.sort(n));

	}
	

}
