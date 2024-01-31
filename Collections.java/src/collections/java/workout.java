package collections.java;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class workout {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the value");
		
		int n=scan.nextInt();
		int rem;
		int total = 0;
		
		// to reverse a number
		
		while(n>0) {
			rem= n%10;
		   total = total+rem ;
		   n=n/10;
	
	}
		System.out.println(total);
		
		//addtion of digits
		int a=0;
		int b=1;
		int c;
		for(int i=0;i<=7;i++) {
			
					
			System.out.println(a);
			c=a+b;
			a=b;
			b=c;
		}
		
		List<String> li=Arrays.asList("a","b","c");
		
		li.forEach(s-> s.contains(s));
		li.forEach(System.out::println);
		
		
	}
}
