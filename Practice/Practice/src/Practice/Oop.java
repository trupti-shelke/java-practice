package Practice;


class car{
	
	String color;
	String brand;  // variables -> data
	int speed;
	private long balance ;
	
	
	
	
	public long getBalance() {
		return balance;
	}

	public void setBalance(long balance) {
		this.balance = balance;
	}

	void start() {   // methods 
		System.out.println("Car Started");
	}
	
	void stop() {
		
		System.out.println("Car Stopped");
		
	}
	
	
	car(){
		
		System.out.println("Inside constructor");
	}

	public car(car obj) {
		this.color =  obj.color;
		this.brand = obj.brand;
		
	}
	
	
	
}


public class Oop {
  
	public static void main(String[] args) {
		
		 car obj = new car();
		 
		 
		 obj.color ="red";
		 
		 obj.brand ="BMW";
		 
		 obj.speed = 100;
		 int no = 9999999;
		 obj.setBalance(no);
		 System.out.println(obj.getBalance());
		 
		 obj.start();

         obj.stop();
		 
		 
         car obj2 = new car(obj);
         
     
		System.out.println("values: Color ---> " + obj2.color +"      Brand --->"+ obj2.brand + "    Speed ---->" + obj2.speed );
         
		
		
		
		Encapsulation encapsulation = new Encapsulation();
		
		encapsulation.setBalance(4000);
		
		
		System.out.println("Truptis balance  ====> "+encapsulation.getBalance());
		 
	}
	
}
