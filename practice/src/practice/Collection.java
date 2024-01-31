package practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Collection {

	public static void main(String[] args) {
		
		Collection n = new Collection();

		{
			ArrayList name= new ArrayList();
			name.add(10);
			name.add("name");
			name.add(30.66);
			name.add(true);
			name.add('A');
			System.out.println(name);
			System.out.println(args[0]);
			
		}

		
		 TreeSet<String> hash_Set = new TreeSet<>();
		 
		    hash_Set.add("One");
	        hash_Set.add("Geeks");
	        hash_Set.add("For");
	        hash_Set.add("Geeks");
	        hash_Set.add("Example");
	        hash_Set.add("Set");
	       
	        Iterator<String> it= hash_Set.descendingIterator();
	        while(it.hasNext()) {
	        	System.out.println(it.next());
	        }
//        System.out.println( hash_Set.remove("one"));
//        System.out.println(hash_Set);
	        
	       List<String> itr = hash_Set.stream().filter(p->p.contains("Set"))
	        .collect(Collectors.toList());
	       
	     //  System.out.println(itr);
		

	}
	
	 
	
	static {
		System.out.println("static");
		
	}
	
	{
		System.out.println("empty");
	}

}
