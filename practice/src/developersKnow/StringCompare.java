package developersKnow;

public class StringCompare {

	public static void main(String[] args) {
		stringCompare();
	//	hell();
		nestedloopExample();

		reverseString();
		reverse();
	}

	public static void stringCompare() {

		String s1 = new String("Hello");
		String s2 = new String("Hello");
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));

	}
	
	
	public static void hell() {
		
		int a[] = {1,4,6,9,8};
		
		
		int target =5;
		
		for(int i=0;i<a.length;i++) {
			
			
			for(int j=1+i;j<a.length-1;i++) {
				
				if((a[i]+a[j])==target) {
					System.out.println("the values are "+ a[i]+" " +a[j] );
				}
				
			}
			
		}
		
		//System.out.println(a[3]+a[0]);
	}
	
	
	public static void nestedloopExample() {
		
		int count =0;
		
		for(int i=5; i>=0;i--) {
			System.out.print(" ");
			
			for(int j=0;j<=count;j++) {
				System.out.print("#");
				
			}
			count++;
			System.out.println();
		}
		
		
		
	}
	
	
	public static void reverseString() {
		
		String str ="VellaiAmmal";
		
		char c;
		
		
		for(int i=str.length()-1;i>=0;i--) {
			c=str.charAt(i);
			
			System.out.print(c);
		}
	}
	
	
	public static void reverse() {
		String st = "Deepan Vellai";
		System.out.println();
		
		String m="";
		
		for(int i=0;i<st.length();i++) {
			m = st.charAt(i)+m;
		}
		System.out.print(m);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
