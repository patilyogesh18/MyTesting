package Assesment;

public class ShoppingCart extends Product {
	

	public ShoppingCart(String name, double price) {
		super("iphone ", 43000);
		
	}
	
	public void addToCart(String Product,double price) {
		System.out.println("product Name is "+Product + "Price is "+price);
	
	}
	
	public void checkOut() {
		
	}
	

}
