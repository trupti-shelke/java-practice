package Collection.Set;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetDemo {

	public static void main(String[] args) {
             TreeSet set  = new TreeSet<>();
             
             set.add(21);
             set.add(9);
             
             for(int i =10;i<=20;i++) {
            	 
              set.add(i);
              
              
           
             }
             
             System.out.println("First => " +set.first());
             System.out.println("Last => " +set.last());
             System.out.println("Head Set => "+set.headSet(16));
             System.out.println("Tail Set => "+set.tailSet(18));
             System.out.println("Sub set => "+set.subSet(12, 18));
             System.out.println("comparator "+set.comparator());
             
             System.out.println("Heighrt =>"+ set.higher(11) );
             System.out.println("lower =>"+ set.lower(20) );
             
    
	}

}
