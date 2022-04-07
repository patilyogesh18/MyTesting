package Assesment;

public class Product {
	private String Name;
	private double price;
	
	public Product(String name, double price) {
		super();
		Name = name;
		this.price = price;
	}
	
	public void print(String name,double price) {
		System.out.println("Product name is "+name);
		System.out.println("product price is "+price);
	}

	public double getPrice() {
		return price;
	}

	
	
	
	

}
