package collections.java.colPrac;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class SubClass {

	public static void main(String[] args) {
		List<MainClass> ml = new ArrayList<>();

//		MainClass cl = new MainClass(2, "malni", 2000, "tvmalai");
//		System.out.println(cl.getEmpId());

		ml.add(new MainClass(1, "sara", 5000, "delhi"));
		ml.add(new MainClass(2, "begam", 6000, "UK"));
		// System.out.println(ml);

		List<Integer> sal = ml.stream().map(s -> s.getSalary()*2)
				.collect(Collectors.toList());
		
		System.out.println(sal);
//		Iterator it = ml.iterator();
//		
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
	}

}
