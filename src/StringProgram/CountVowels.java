package StringProgram;

public class CountVowels {
	public static void main(String[] args) {
		String s = "Hello";
		int count = 0;
		for (char ch : s.toCharArray())
			if ("aeiou".indexOf(ch) != -1)
				count++;
		System.out.println(count);

	}

}

