package collections.java;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Stream;


public class pattern {
	
	
	public static void main(String[] args) {

		List<String> Str = Arrays.asList("sara", "khan", "xyz", "mnmm");
		
		Str.forEach(s-> System.out.println(s));
				
		Str.forEach(System.out::println);
		
		System.out.println("List");
		Stream<String> atr= Str.stream().filter(s->s.endsWith("a"));
		atr.forEach(System.out::println);
		
		System.out.println("======================");
		for(String s: Str) {
			
			if(s=="sara") {
				System.out.println("babe");
			}
				else {
					System.out.println("wow");
				}
				
			
			
			//System.out.println(s);
		}
		
		HashMap<Integer, String> hash = new HashMap<Integer, String>();
		
		hash.put(1,"sara");
		
	}
	}

