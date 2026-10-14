package Collection.Comparable;

public class ConditionMain {

	public static void main(String[] args) {
	  
		
	Student a = new Student(01,"Asha", 21);
	Student b = new Student(02,"Usha", 24);
	Student c = new Student(03,"Latha", 21);
	

	
	System.out.println("less age between a and b ===> "+a.compareTo(b));
	
	System.out.println("Greater age"+b.compareTo(a));
	
	
	System.out.println( "Equals " +a.compareTo(c));
	}

}
