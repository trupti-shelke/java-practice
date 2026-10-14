package Collection.List;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Stack;
import java.util.Vector;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList<Object> al =  new ArrayList<>();
		
		Integer ino; 
		
		   al.add("demo");
		   al.add(20);
		   al.add("trupti");
		   al.add(40.00);
		   al.add("test");
		   System.out.println(al);
		   
//		   System.out.println("after reverse -->   "+al.reversed());
		   
		   
		   
		   
//		   Iterator iterator = al.iterator();
////		   System.out.println("before  values -->   "+al);
//		   
//		   while (iterator.hasNext()) {
//			   Object next = iterator.next();
//				System.out.println("Object values -->   "+next);
//			if(next.equals("demo")) {
//				 iterator.remove();
//			}
////	
//			
//		
//			
//		}
		   
		   
//		   ListIterator iterator2 = al.listIterator();
//		   
//		   while (iterator2.hasNext()) {
//			   
//				System.out.println("List iterartor Object values -->   "+iterator2.next());
//			
//		}
//		   
//		   while (iterator2.hasPrevious()) {
//			   
//				System.out.println("List iterartor has privious Object values -->   "+iterator2.previous());
//			
//		}
//		   
//		   
//		   
//		   
		   
		   
		   
		   
//		   
//		   System.out.println("after values -->   "+al);
//		   
//		   
//		   
////		   System.out.println(al);
//		   
//		   
//		   LinkedList  ll =  new LinkedList<>();
		   
//		   ll.add("Sham");
//		   ll.add(40);
//		   ll.add(null);
//		   ll.add("Sham");
//		   System.out.println(ll);
//		   ll.add(0,"Ram");
//		   System.out.println(ll);
//		   ll.set(0, "Jems Goslin");
//		   System.out.println(ll);
//		   ll.removeLast();
//		   System.out.println(ll);
//		   ll.addFirst(11);
//		   System.out.println(ll);
		   
		   
		   
		   //Vector
		   
		   Vector<String> v = new Vector<>();
		   
		   v.add("jems Goslin");
		   v.add(new String("Dennies"));
		   v.add("Bajarne");
		   System.out.println(v);
//		   System.out.println(v.size());
//		   
		   
		   Enumeration enumeration = v.elements();
		   
		   while (enumeration.hasMoreElements()) {
		System.out.println(enumeration.nextElement());
			
		}
		   
		   
		
		
		
//		Stack<Double> s =  new Stack<>();
//		
//		s.push(44.01);
//		s.push(12.01);
//		s.push(65.01);
//		s.push(85.01);
//		s.push(32.01);
//		s.push(75.01);
//		System.out.println(s);
//		System.out.println(s.pop());
//		System.out.println(s);
//		System.out.println(s.peek());
		
		
		
	}
    

	
   
}
