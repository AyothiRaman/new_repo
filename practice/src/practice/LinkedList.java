package practice;

import java.util.Iterator;

public class LinkedList {
	
      public  static void hell(String s) {
		System.out.println(s);
	}
	

	public static void main(String[] args) {
		
		LinkedList.test();
		
		java.util.LinkedList<String> al=new java.util.LinkedList<>();  
		al.add("Ravi");  
		al.add("Vijay");  
		al.add("Ravi");  
		al.add("Ajay"); 
		al.addFirst("first");
		
		
//		al.forEach(n->{
//			System.out.println(n);
//		});
		
//		List li = al.stream().distinct().collect(Collectors.toList());
//		System.out.println(li);
		
		System.out.println("printed succesful");
		Iterator<String> itr = al.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
			
			
		}
		 
		if(itr.hasNext()) {
			System.out.println("ravi is available");
		}
	//	al.forEach(LinkedList::hell);
		
		
//		System.out.println(al.get(3));
//		System.out.println(al);
//		System.out.println(al.descendingIterator());
//		
//		al.addLast("aaa");
//		System.out.println(al.get(1));
//		System.out.println(al);
//		
//		Iterator<String> it=al.iterator();
//		
//		while(it.hasNext())
//		{
//			System.out.println(it.next());
//		}
//		
//	
//		
//	
//		Collections.sort(al, Collections.reverseOrder());	
//		
//		System.out.println(al.size());
//		
//		
//		System.out.println(al);
		
		
		}
	
	public static void test() {
		int i=0;
		int j=i;
		j=i++ +j;
		System.out.println(i+"-"+j);
	}
	
	
	

}
