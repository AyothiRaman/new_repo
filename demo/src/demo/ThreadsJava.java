package demo;

class Execute extends Thread{
	 public void run() {
		
		String s = "helloearth",n="";
		char c;
		
		
		for(int i=0;i<=s.length()-1;i++) {
			c=s.charAt(i);
			n=c+n;
			
		}
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(n);
	}
	
}

class Exe extends Thread{
	 public void run() {
		System.out.println("run method 2");
	}
}

public class ThreadsJava{

	
	 
	public static void main(String[] args) {
		
		Execute ex = new Execute();
		ex.start();
		ex.isAlive();
		
		Exe e = new Exe();
		
		e.start();
		
		


	}

}
