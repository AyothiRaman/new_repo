package demo;

import java.util.Stack;

public class Vec {
	public static void main(String[] args) {
		
	
	
	  System.out.println("Required packages have been imported");
      String input_string = "Java Program";
      System.out.println("The string is defined as " +input_string);
      char[] reverse = new char[input_string.length()];
      
     // char reverse = 0;
     
      Stack<Character> stack = new Stack<Character>();
    
      for (int i = 0; i < input_string.length(); i++) {
         stack.push(input_string.charAt(i));
        // System.out.println(i);
      }
      
      int i = 0;
      while (!stack.isEmpty()) {
         reverse[i++] = stack.pop();
      }
      String result = new String(reverse);
      System.out.println("The reversed string is: " + result);
	}
}
