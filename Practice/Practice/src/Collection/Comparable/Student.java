package Collection.Comparable;

public class Student implements Comparable<Student> {
	int id;

	String name;

	int age;

	public Student(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	@Override
	public int compareTo(Student o) {

		if(this.age < o.age) return -1;
		
		if(this.age > o.age) return 1;
		
		return 0;
		
		//step 1 : Current > Given negative  -1
		
		//step 2 :  Current < Given  eqials  0
		
		//step 3 :  Given = Current   positive 1
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

}
