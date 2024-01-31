package com.ss.collections;

import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MockTest {

	public static void main(String[] args) {

		Employee emp1 = new Employee(1, "John", 20, "Finance");
		Employee emp2 = new Employee(2, "Jim", 20, "Finance");
		Employee emp3 = new Employee(3, "Jack", 22, "HR");
		Employee emp4 = new Employee(4, "Jill", 25, "IT");
		Employee emp5 = new Employee(5, "Jonathan", 25, "IT");
		Employee emp6 = new Employee(6, "Erika", 25, "HR");
		Employee emp7 = new Employee(7, "Mark", 25, "IT");
		Employee emp8 = new Employee(7, "Mark", 25, "IT");
		Employee emp9 = emp7;

		List<Employee> list = new ArrayList<Employee>();
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		list.add(emp4);
		list.add(emp5);
		list.add(emp6);
		list.add(emp7);
		list.add(emp8);
		list.add(emp9);
		

		list.forEach(n -> System.out.println(n.getName()));

		HashSet list1 = new HashSet<>(list);

		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("one", "Ravi");
		hm.put("two", "Prateek");
		hm.put("three", "Davesh");
		hm.put("four", "Kamal");
		hm.put("five", "Pawan");

		System.out.println("for each");

		for (Map.Entry<String, String> entry : hm.entrySet()) {
			System.out.println(entry.getKey() + entry.getValue());
		}

		System.out.println();
		System.out.println();
		System.out.println();

		for (String s : hm.keySet()) {
			System.out.println(s);
		}

		for (String h : hm.values()) {
			System.out.println(h);
		}

		System.out.println("using iterator\n");
		Iterator<Map.Entry<String, String>> itr = hm.entrySet().iterator();

		while (itr.hasNext()) {
			Map.Entry<String, String> entry = itr.next();
			System.out.println("key:" + entry.getKey() + "value:" + entry.getValue());
		}

		System.out.println("using lambda");
		hm.forEach((k, value) -> System.out.println("key:" + k + "value" + value));
		
		
		//hm.keySet().stream().filter(n->n.length());
		
	long l=	 hm.values().stream().filter(n->n.equals("Kamal")).collect(Collectors.counting());
		
	System.out.println(l);
	}
}
