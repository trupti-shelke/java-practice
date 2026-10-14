package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Strings {

	public static void main(java.lang.String[] args) {
		System.out.println("|| jay ganesha ||");
		
		System.out.println("remove duplicate from number");
		
		List<Integer> list =  Arrays.asList(10,30,40,22,23,34,54,44,33,22,40);
		
		list.stream().distinct().collect(Collectors.toList()).forEach(System.out::println);

		System.out.println("duplicate numbers");
		Set<Integer> set = new  HashSet<>();
 		list.stream().filter(c-> !set.add(c)).forEach(System.out::println);

	// "Java is fun"
 		System.out.println("Reverse words in string ''' Before : --->Java is fun");
 		
 		String str = "Java is fun";
 		
 		if(str == null || str.trim().isEmpty()) {
 			return ;
 		}
 		
// 		String[] s = str.trim().split("\\s+");
// 		StringBuffer buffer =  new StringBuffer();
// 		for(int i = s.length-1; i>= 0;i--) {
// 				buffer.append(s[i]);
// 				if(i!=0) {
// 					buffer.append(" ");
// 				}
// 			
// 		}
// 		
// 		System.out.println(buffer.toString());
 		
 		System.out.println("Reverse String using java  1.8");
 		
 		List<String> words =  Arrays.asList(str.trim().split("\\s"));
 		System.out.println(words.reversed().toString());
 		
 		
 		//String Aagram
 		//Write a method to check if two strings are anagrams of each other.
// 		Example: "listen" and "silent"
 		System.out.println("String anagram");
 		String str1 =  "listen";
 		String str2 = "silent";
 		
 		if(str1.length()!=str2.length()) {
 		System.out.println("String not anagram");
 			return;
 		}
 		
 		
 		
 		
 	}

}
