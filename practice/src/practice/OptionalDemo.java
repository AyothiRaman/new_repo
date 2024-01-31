package practice;

import java.util.Optional;

public class OptionalDemo {

	public static void main(String[] args) {


//		String name="Hello Everyone";
//		
//	
//		
//		if(name!=null) {
//			System.out.println(name.length());
//		}
//		
//		Optional<String> hello = Optional.of(name);
//		hello.ifPresent(st -> System.out.println( st.charAt(0)));
//	}
		countWords();
		firstNonRepetedCharacter();
		comparable();
	}


public static void countWords() {
	
	String data ="the great wall of india";
	int count =0;
	char c ='e';
	
	
	for(int i=0; i<data.length();i++) {
		if(data.charAt(i)==c) {
			count ++;
		}
	}
	
	System.out.println(" the total values of e is  "+ count);
}

public static void firstNonRepetedCharacter() {
	String d = "teeths";
	
	for(char i:d.toCharArray() ) {
		if(d.indexOf(i) == d.lastIndexOf(i)) {
			System.out.println("the non repeted character is  "+ i);
		}
	}
}


public static void comparable() {
	
	String name="Alaster";
	
	System.out.println("the value is" +name.compareTo("ajj"));
	
	String str_Sample = "Alaster";
    System.out.println("Compare To 'a' b is : " + str_Sample.compareTo("ajj"));
	
}
}