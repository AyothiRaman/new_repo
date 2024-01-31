package collections.java;


class Walk{
	int a=10;
	
	public Walk() {
		System.out.println("walk");
		
	}
	 
}


class Run extends Walk {
	
	int a=this.a;
	public Run() {
		super();
		System.out.println("this is Run ");
		System.out.println(a);
	}
	
}

public class Work {
	
	public static void main(String[] args) {
		Run cls=new Run();
	}
	
	 
}

