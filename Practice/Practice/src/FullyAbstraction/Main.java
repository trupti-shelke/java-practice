package FullyAbstraction;

public class Main {

	public static void main(String[] args) {
		Payment payment = new CreaditCardPayment();
		
		payment.pay();
	}

}