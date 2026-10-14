package Collection.Set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
 
		 LinkedHashSet<Integer> lhs  = new LinkedHashSet<>();
		 
		 lhs.add(45);
		 lhs.add(47);
		 lhs.add(null);
		 lhs.add(null);
		 lhs.add(47);
		 lhs.add(40);
		 lhs.add(50);
		 
		 for(Integer i : lhs) {
			 System.out.println(i);
		 }
		 
		 Iterator<Integer> iterator  = lhs.iterator();
		 
		 while(iterator.hasNext()) {
			 System.out.println("iterator ->  "+ iterator.next());
		 }

	}

}
