package NumberProgram;

import java.util.Scanner;

public class Greater100 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if (a > 100) {
			System.out.println("a is Greater Than 100");
		} else {
			System.out.println("a is Not Greate Than 100");
		}
	}

}
