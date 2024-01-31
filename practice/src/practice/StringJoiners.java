package practice;

import java.util.Scanner;
import java.util.StringJoiner;

public class StringJoiners {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringJoiners.stringJoiners();
		
		hell();

	}
	
	public static void stringJoiners() {
		StringJoiner stringJoiner = new StringJoiner(",,");
		
		stringJoiner.add("1");
		stringJoiner.add("2");
		stringJoiner.add("3");
		stringJoiner.add("4");
		
		System.out.println(stringJoiner);
	}
	
	
	public static void hell() {
		String original, reverse = "";
        Scanner in = new Scanner(System.in);
        int length;
        System.out.println("Enter the number or String");
        original = in.nextLine();
        length = original.length();
        for (int i =length -1; i>=0; i--) {
            reverse = reverse + original.charAt(i);
        }
        System.out.println("reverse is:" +reverse);
         
        if(original.equals(reverse)) 
            System.out.println("The number is palindrome");
        else
            System.out.println("The number is not a palindrome");
	}

}
