package basicprogram;

public class ArmstrongNumber {
	public static void main(String[] args) {
		int num = 153;
		int x = num;
		int sum = 0;
		while (num > 0) {
			int d = num % 10;
			sum = sum + (d * d * d);
			num = num / 10;
		}
		if (sum == x) {
			System.out.println("Armstrong Number");
		} else {
			System.out.println("Not Armstrong Number");
		}
	}

}
