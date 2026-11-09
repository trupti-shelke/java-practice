package ArrayProgram;

public class ArrayMin {
	public static void main(String[] args) {
		int arr[]= {20,30,10,33,99};
		int min=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		System.out.println(min);
	}

}
