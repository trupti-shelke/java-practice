package StringProgram;

public class StringPalidrome {
	public static void main(String[] args) {
		String s = "Hello";
		String rev = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);
		}
		if (s.equals(rev)) {
			System.out.println("String Palidrome");
		} else {
			System.out.println("String Not Palidrome");
		}
	}

}
