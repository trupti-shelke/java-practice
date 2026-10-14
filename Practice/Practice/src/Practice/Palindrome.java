package Practice;

public class Palindrome {
//TODO: 2. Check Palindrome String
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str =  "madam";
		String strRev="";
		for(int i=str.length()-1; i>=0; i--) {
		strRev +=str.charAt(i);
		}
		if(strRev.length()==str.length()) {
			for(int i =0; i<str.length(); i++) {
				if(str.charAt(i)!=strRev.charAt(i)) {
					System.out.println("String is not palindrome...!");
					return ;
				}
			}
			System.out.println("String is palindrome... !!");
		}
		else {
			System.out.println("String is not palindrome... !!!");
		}
	}

}
