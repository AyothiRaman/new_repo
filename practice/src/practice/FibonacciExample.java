package practice;

public class FibonacciExample {

	public static void main(String[] args) {


		int num =0,
				num1=1,
				num2;
		
		 System.out.print(num+" "+num1);
		
		for(int i=2;i<=10;++i) {
			
			num2=num+num1;
			System.out.print(" "+num2);
			
			num=num1;
			num1=num2;
		}
	}

}
