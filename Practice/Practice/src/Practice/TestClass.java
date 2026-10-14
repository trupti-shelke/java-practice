package Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class TestClass {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
        // Read a line of input, split by spaces, and convert to a list of Integers
        List<Long> numbers;
        try {
            String inputLine = br.readLine();
            String[] stringNumbers = inputLine.split(" ");
            numbers = new LinkedList<>();
            for (String s : stringNumbers) {
                numbers.add(Long.parseLong(s));
            }
        } catch (IOException | NumberFormatException e) {
            System.err.println("Error reading or parsing input: " + e.getMessage());
            return;
        }
        
        // Use a map to count the occurrences of each number
        Map<Long, Integer> duplicateCount = new HashMap<>();
        
        for(Long num : numbers) {
            duplicateCount.put(num, duplicateCount.getOrDefault(num, 0) + 1);
        }
        
        // Find the maximum count
        int maxCount = 0;
        for(int count : duplicateCount.values()) {
            if(count > maxCount) {
                maxCount = count;
            }
        }
        
        // Print the result
        System.out.println( maxCount);
	}

}
