package Collection.Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		Student student = new Student(1, "Trupti", 21);
        
		List<Student> list =  new ArrayList<>();
		list.add(student);
		list.add(new Student(2, "Shreya", 20));
		list.add(new Student(3,"Ram",25));
		
		for(Student s : list) {
			System.out.println(s);
		}
		
		System.out.println("=======================");
		
		Collections.sort(list);
		
		for(Student s : list) {
			System.out.println(s);
		}

	}

}
