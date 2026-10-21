package JavaNumberProgram;

public class Palidromeno {
	public static void main(String[]args) {
		int n=1221;
		int x=n;
		int r=0;
		while(n>0) {
			r=r*10+n%10;
			n=n/10;
		}if(x==r) {
			System.out.println("palidrome");
		}else {
				System.out.println("no");
			}
		}
		
	}


