package Women;

import Man.Men;

interface hello{
	void news();
}

public class Woman extends Men{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Men m=new Men();
m.height();
		Woman n=new Woman();
		n.height();
		
		hello h =()->{
			
			System.out.println("hello");
		};
		h.news();
	}

}
