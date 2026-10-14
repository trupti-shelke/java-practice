package practice;

public class LongestSubArray {

	
	public static void main(String[] args) {
		int arr[] ={1,2,3,5,8,11,13,17,19,3,4,7,9,10,11};
		int maxLength = 1;
		int currentLength = 1;
		int enfIndex = 0;
		
		for(int i =1; i< arr.length; i++) {
			if(arr[i] > arr[i-1]) {
				currentLength++;
			}
			else {
				if(currentLength> maxLength) {
					maxLength = currentLength;
					enfIndex = i -1;
					
				}
				currentLength =1;
			}
		}
		if(currentLength > maxLength) {
			maxLength = currentLength;
			enfIndex = arr.length - 1;
		}
		
		System.out.println("Longest Increasing sub-array");
		
		for(int i = enfIndex - maxLength+1 ; i <= enfIndex; i++) {
			System.out.println(arr[i]+ " ");
		}
		
	}
	
	
}
