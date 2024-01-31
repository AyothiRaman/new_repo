package practice;

import java.util.HashMap;

class Class1
{
	public void method() 
	{
		System.out.println("method 1");
	}
}
class Class2 extends Class1 
{
	public void method() 
	{
		super.method();
		System.out.println("method2");
	}
}
class Class3 extends Class2
{
	
	public void method()
	{
		
		super.method();
		System.out.println("method3");
	}
}


public class MehodOverRidding {
	
	public static void main(String[] args) {
		
		Class3  cl =new Class3();
		cl.method();
		hashMap();
		
	}
	
	
	public static void hashMap() {
		
		int week =2;
		int days =7;
		int i=1;
		
		while(i<=week) {
			System.out.println("the week is "+i);
			
			for(int j=0;j<=days;j++) {
				System.out.println("the days are"+j);
			}
			++i;
		}
	}

}
