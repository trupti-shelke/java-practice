package Collection.Set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
	HashSet<Integer> hs =  new HashSet<>();
	
	hs.add(27);
	hs.add(12);
	hs.add(null);
	hs.add(9);
	hs.add(21);
	hs.add(27);
	hs.add(null);
	System.out.println(hs.size());
	
	System.out.println(hs);
	
	for(Integer integer : hs) {
		System.out.println("elements -->  "+integer);
	}
	
	Iterator<Integer> iterator = hs.iterator();

	while(iterator.hasNext()) {
		System.out.println(iterator.next());
	}
	}

}
