package basicprogram;

public class PalidromeNumber {
	public static void main(String[] args) {
		int num = 12321;
		int x = num;
		int rev = 0;
		while (num > 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;
		}
		if (rev == x) {
			System.out.println("Num is Plaidrome");
		} else {
			System.out.println("Num Is Not Palidrome");
		}
	}
}
