package Collection_in_java;
    import java.util.ArrayList;
	import java.util.Iterator;

	public class initilizearray {

	    public static void main(String[] args) {
	        ArrayList<Integer> ar = new ArrayList<>();

	        ar.add(11);
	        ar.add(22);
	        ar.add(33);
	        ar.add(44);
	        ar.add(55);

	        Iterator<Integer> i = ar.iterator();
	        while (i.hasNext()) {
	            System.out.println(i.next());
	        }

	        ar.remove(0);

	        ArrayList<Integer> al = new ArrayList<>();
	        al.add(66);
	        al.add(77);
	        al.add(88);

	        System.out.println(ar);
	        al.addAll(ar);

	        System.out.println(al);
	        System.out.println(al.get(0));
	        System.out.println(al.contains(77));
	        al.clear();
	        System.out.println(al);
	    }
	}


