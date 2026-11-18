package oops;

class Student {
    private int rollNo;

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public int getRollNo() {
        return rollNo;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Student s = new Student();
        s.setRollNo(101);

        System.out.println("Roll No: " + s.getRollNo());
    }
}