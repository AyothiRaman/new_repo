package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class streams {
	
	public static void main(String[] args) {
		
		
		
		
		String n = new String();
		
		
	
		String str ="hello"; //-->   String constant pool
		
		String d = str+"sachin"; 
		
		
		
		ArrayList<Integer>num=new ArrayList<Integer>();
		
		num.add(10);
		num.add(11);
		num.add(12);
		num.add(12);
		
	
		
		System.out.println(num);
		
		
		List newNUm=num.stream().distinct().collect(Collectors.toList());
		newNUm.c
		
		System.out.println(newNUm);
		
//		List<Integer> newNum=num.stream().filter(p->p.MAX_VALUE).map(p->p.MAX_VALUE)
//				.collect(Collectors.toList());
		
		Integer var = num.stream().max(Integer::compare).get();
		System.out.println(var);
		
		
	}
	
	
	
	
	

}
