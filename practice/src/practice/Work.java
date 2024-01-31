package practice;

import java.util.HashMap;

public class Work {

	public static void main(String[] args) {
		
		repeatedValues();
		hell();

		 String str1 = "Hello";
	        String str2 = "olelh";

	        // Printing hash codes
	       // System.out.println("Hash code for \"" + str1 + "\": " + str1.hashCode());
	       // System.out.println("Hash code for \"" + str2 + "\": " + str2.hashCode());

	        // Checking if the hash codes are equal
	       // System.out.println("Hash codes are equal: " + (str1.hashCode() == str2.hashCode()));
	}
	
	public static void hell() {
		String s ="Ayothi raman";
		
		HashMap<Character, Integer> map=new HashMap<>();
		
		for(char c :s.toCharArray()) {
			
			if(map.containsKey(c)) {
				int count =map.get(c);
				map.put(c, count+1);
			}else {
				map.put(c, 1);
			}
			
		}
		
		for(Character key:map.keySet()) {
			System.out.println(key+":"+map.get(key));
		}
		
	
		
	}
	
	
	
	public static void repeatedValues() {
		String s="ababccdee";
		
		HashMap<Character, Integer> values = new HashMap<>();
		
		for(char c:s.toCharArray()) {
			if(values.containsKey(c)) {
				int count =values.get(c);
				values.put(c, count+1);
				
				
			}else {
				values.put(c, 1);
			}
		}
		
		for(Character key:values.keySet()) {
			System.out.println(key+":"+ values.get(key));
		}
		
		
	}

}
