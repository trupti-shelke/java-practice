package List;
import java.util.ArrayList;

public class ArrayListDemo {

    public static void main(String[] args) {

        ArrayList <String>al = new ArrayList<>();

        al.add("Java");
        al.add("Python");
        al.add("C++");
        al.add(0,"HTML");
        al.set(1, "JavaScript");
        al.remove(3);
        al.remove("java");
        System.out.println(al);
        al.contains("JavaScript");
        System.out.println(al);
        al.add("DSA");
        System.out.println(al);
        al.contains("DSA");
        al.remove("DSA");
      System.out.println(al.size());
      System.out.println(al.isEmpty());
        System.out.println(al);
        
        
    }
}