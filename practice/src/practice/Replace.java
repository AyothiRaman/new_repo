package practice;

import java.util.Scanner;

public class Replace {
//
//	public static void main(String[] args) {
////  String str = "ZAKAPPERSS";
////  
////  String strNew = str.substring(0, str.length()-4);
////  
////  System.out.println(strNew);
//		
//		 String str = "ZAKAPPERSS";  
//         System.out.println(charRemoveAt(str, 6));  
//         char d;
//         
//         for(int i=0;i<str.length();i++) {
//        	
//         }
//      }  
//	 public static String charRemoveAt(String str, int p) {  
//         return str.substring(0, p) + str.substring(p + 3);  
//      }  
	
	
	 public static int sum_of_digit(int num)
	    { 
	        if (num == 0)
	            return 0;
	        return (num % 10 + sum_of_digit(num / 10));
	    }
	    public static void main(String args[])
	    {
	    	arrayOutOfBoundException();
	    	stringReverse("hello world");
	        
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the number: ");
	        int num=sc.nextInt();
	        int res=sum_of_digit(num);
	        System.out.println("The sum of digits is: "+res);
	    }
	    
	    
	    public static void stringReverse(String str) {
	    	
	    	char c[];
	    	
	    	String s="";
	    	
	    	
	    	for(int i=0;i<str.length();i++) {
	    		
	    		s= str.charAt(i)+s;
	    		
	    	}
	    	System.out.println(s);
	    	
	    	
	    }
	    
	    public static void arrayOutOfBoundException() {
	    	
	    	String s ="avc";
	    	int c =Integer.parseInt(s);
	    	System.out.println(c);
	    	
	    	try {
	    		int x[] =new int[5];
	    		x[6]=90;
	    	}catch(ArrayIndexOutOfBoundsException r) {
	    		System.out.println(r);
	    	}
	    }
	}


