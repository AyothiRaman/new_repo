package developersKnow;


class Bank{
  int	getTheInterest() {
	return 0;
	  
	  
	
}
  
  
}

class SBI extends Bank{
	  int	getTheInterest() {
		return 0;
			
	  }
	  }

class Indian extends Bank{
	  int	getTheInterest() {
		return 0;
		
	  }
	  }

class HDFC extends Bank{
	  int	getTheInterest() {
		return 0;
	  }
	  }

public class RuntimePolymorphism {

	public static void main(String[] args) {
		
		Bank b;
		b= new HDFC();
System.out.println(b.getTheInterest());
		b= new Indian();
		System.out.println(b.getTheInterest());

		b= new SBI();
		System.out.println(b.getTheInterest());


	}

}
