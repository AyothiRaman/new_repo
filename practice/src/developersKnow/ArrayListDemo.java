package developersKnow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<>(
				Arrays.asList("a","b","c","d"));
	
		
		// Method 1
		list.removeIf(word -> word.equals("b"));
		
		
		
		// Method 2
		
		Iterator<String> itr = list.iterator();
		
		while(itr.hasNext()) {
			String datas = itr.next();
			
			if(datas.equals("a")) {
				itr.remove();
			}
		}
		
		System.out.println(list);
		
		
		
		// Method 3
		
		for(int i=0;i<=list.size();i++) {
			String s = list.toString();
			
			if(s.contains("c")) {
				list.remove(i);
			}
			System.out.println(s);
		}
		
		
	}

}
