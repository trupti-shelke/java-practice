package List;



import java.util.LinkedList;

public class LinkedListDemo {

    public static void main(String[] args) {

        LinkedList<Integer> Ll = new LinkedList<>();

        Ll.add(10);
        Ll.add(20);
        Ll.add(30);

        System.out.println(Ll);
        Ll.addFirst(5);
        System.out.println(Ll);
        Ll.addLast(40);
        System.out.println(Ll);
        int a=Ll.get(2);
        System.out.println(a);
        System.out.println(Ll.get(1));

        
    }
}