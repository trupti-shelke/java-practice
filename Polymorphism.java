package oops;

class Vehicle {
    void run() {
        System.out.println("Vehicle is running");
    }
}

class Bike extends Vehicle {
    @Override
    void run() {
        System.out.println("Bike is running");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Vehicle v = new Bike();
        v.run();
    }
}