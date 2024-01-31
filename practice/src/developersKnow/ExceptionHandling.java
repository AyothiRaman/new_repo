package developersKnow;

public class ExceptionHandling {

	public static void main (String[] args) throws IndexOutOfBoundsException {
	    
	        try{

	        	int x =100/0;
	        	System.out.println(x);
	        }
	      catch(ArithmeticException e){
	        System.out.println(e);
	      //  throw e;
	       
	      }
	        finally {  
	        	System.out.println("finally block is always executed");  
	        	}  
	        System.out.println("rest of the code");
	    }
}
