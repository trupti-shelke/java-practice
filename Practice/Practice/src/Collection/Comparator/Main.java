package Collection.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		Student student = new Student(1, "BTrupti", 21);
        
		List<Student> list =  new ArrayList<>();
		list.add(student);
		list.add(new Student(2, "CShreya", 20));
		list.add(new Student(3,"ARam",25));
		
		for(Student s : list) {
			System.out.println(s);
		}
		
		System.out.println("=======================");
		
     Collections.sort(list, new AgeComparator());
		for(Student s : list) {
			System.out.println(s);
		}
 
		
     Collections.sort(list, new NameComparator());
     
     
     System.out.println("=======================");
		for(Student s : list) {
			System.out.println(s);
		}

	}

}
