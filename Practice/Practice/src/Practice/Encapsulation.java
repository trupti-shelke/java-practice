package practice;

class Encapsulation{
   
   public static void main(String[] args) {
	
	   Student stud = new Student();
	   
	  
	   stud.setRollNo(11);
	   stud.setName("ShaM");
	   stud.setBankDetails("34352******4546");
	   
	   
	   System.out.println("stud value: " + stud.getBankDetails());
}

}