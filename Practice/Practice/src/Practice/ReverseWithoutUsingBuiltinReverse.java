package Practice;

public class ReverseWithoutUsingBuiltinReverse {
//TODO: Question: Reverse a string without using built-in reverse.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Ajay";
		
		for(int i=str.length()-1; i>=0;i--) {
		System.out.print(str.charAt(i));	
		}
	}

}
