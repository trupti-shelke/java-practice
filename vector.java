package Collection_in_java;
   import java.util.Vector;
	public class vector {
	    public static void main(String[] args) {
	        Vector<Integer> t = new Vector<Integer>();
	        t.add(22);
	        t.add(44);
	 
	        t.add(66);
	        t.add(88);

	        System.out.println(t);

	        t.remove(3);

	        System.out.println(t);
	    }
	}
