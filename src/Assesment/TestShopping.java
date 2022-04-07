package Assesment;

public class TestShopping {

	public static void main(String[] args) {
		ShoppingCart cart=new ShoppingCart("product",0);
		cart.addToCart("iphone 12 mini ",43000);
		cart.addToCart("apple watch 7 ", 32000);
		cart.checkOut();
		
		

	}

}
