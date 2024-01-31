package programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;

public class StringProgram {

	public static void main(String[] args) {

//		checkDigits("12345");
//		checkCharacters("abcdef");
//		checkChractersOrDigits("abc123");
//		findDuplicatesInTheString("ayothi raman");
		
		removeWhiteSpace("hel llo hh");
		
		nestedLoopToPrint1to100();

		int h = StringProgram.recursion(10);
		System.out.println(h);
		

	}

	// check if the string contains only digits

	public static void checkDigits(String str) {

		if (str.matches("\\d+")) {
			System.out.println("String contains only digits");
		} else {
			System.out.println("no");
		}

	}

	// check if the string contains only characters

	public static void checkCharacters(String str) {
		if (str.matches("\\D+")) {
			System.out.println("String Contains only characters");
		} else {
			System.out.println("no");
		
		}
	}

	// Check If the String Contains Only Letters or Digits

	public static void checkChractersOrDigits(String str) {
		boolean output = Pattern.matches("^[a-zA-Z0-9]+$", str);

		if (output) {
			System.out.println("The string contains only letters or digits.");
		} else {
			System.out.println("The string contains other characters besides letters and digits.");
		}
	}

	// Find the duplicates in the String

	public static void findDuplicatesInTheString(String str) {

		Map<Character, Integer> charValues = new HashMap<>();

		char[] c = str.toCharArray();

		for (char chr : c) {
			if (charValues.containsKey(chr)) {
				charValues.put(chr, charValues.get(chr) + 1);
			} else {
				charValues.put(chr, 1);
			}

		}
		Set<Map.Entry<Character, Integer>> entrySet = charValues.entrySet();
		System.out.println("Duplicate characters in the string:");
		for (Map.Entry<Character, Integer> entry : entrySet) {
			if (entry.getValue() > 1) {
				System.out.println(entry.getKey() + " : " + entry.getValue() + " times");
			}
		}

	}

	public static int recursion(int k) {
		if (k > 0) {
			return k + recursion(k - 1);
		} else {
			return 0;
		}
		
		
	}

	public static void nestedLoopToPrint1to100() {

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j <= 10; j++) {
				System.out.println(i * 10 + j);
			}
		}

	}
	
	public static void removeWhiteSpace(String str) {
		
		String s="";
		
		for(int i=0;i<str.length();i++) {
			char c=str.charAt(i);
			
			if(!Character.isWhitespace(c)) {
				s+=c;
			}
		}
		
		System.out.println(s);
	}

}
