package lesson2.lecture.unidirectional.oneToZeroOneEasy_extpackage;

import lesson2.lecture.unidirectional.oneToZeroOneEasy.*;

public class Main {
	public static void main(String[] args) {
		Customer cust = new Customer("Bob");
//		ShoppingCart shopie = cust.addCart(); wouldnt work because addcart is void
		cust.addCart();
		cust.getCart().addItem(new Item("Shirt"));
		cust.getCart().addItem(new Item("Shirt"));
		System.out.println(
			cust.getCart().getItems());
		
		
	}
	
}

		
