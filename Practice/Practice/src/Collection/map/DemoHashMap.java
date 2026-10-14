
package collection.map;

import java.util.HashMap;

public class DemoHashMap {

	public static void main(String[] args) {
 
		
		HashMap<Integer,String> hashMap= new HashMap<>();
		
		hashMap.put(32, "Yuvraj");
		hashMap.put(7, "Dhoni");
		
		hashMap.put(18, "Kohli");
		
		hashMap.put(12, "Dhoni");
		
		
		
		System.out.println(hashMap);
		System.out.println(hashMap.size());
		
		System.out.println(hashMap.keySet()); 
		

		System.out.println(hashMap.values()); 
		
		System.out.println(hashMap.entrySet()); 
		
		System.out.println(hashMap.containsKey(7)); 
		System.out.println(hashMap.containsValue("Dhoni")); 
		
		
	}

}
