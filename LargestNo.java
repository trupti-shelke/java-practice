package ArrayProgram;

public class LargestNo {
	public static void main(String[] args) {
		int arr[]= {30,12,39,39,77};
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.println(max);
	}

}
