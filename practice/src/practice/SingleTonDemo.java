package practice;


class First_Demo{
	
	private static First_Demo f1 = null;
	
	// create object if it's not already created
	public static First_Demo getValue() {
		if(f1==null) {
			f1= new First_Demo();
		
		}
		return f1;
	}
	
	// when we give private for the constructor we cannot create an object for that class
	private First_Demo() {
		
	}
}

public class SingleTonDemo {
	
	public static void main(String[] args) {
		
		Second_Demo s = new Second_Demo();
		s.news();
		
		First_Demo f1 = First_Demo.getValue();
		System.out.println(f1);
		
		
		First_Demo f2 = First_Demo.getValue();
		System.out.println(f2);		
		
	}
	
}

class Second_Demo{
	
	public void news() {
	First_Demo f1 = First_Demo.getValue();
	System.out.println(f1);

	}
}
