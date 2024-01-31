package demo;

public class ConditionalPractice {

	public static void main(String[] args) {

		int x=10;
		
		if(x<10|| x>30) {
			System.out.println("value of x is  "+x);
			
		}
		else if(x<9||(x<30 &&x<30)) {
			System.out.println("the value of x is"+x);
		}else {
			System.out.println("nothing");
		}
	}

}
