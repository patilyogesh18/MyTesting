package variable_study;

public class Demo4 {

	public static void main(String[] args)
	{
		int qty=5;
		int price=1000;
		
		double total=qty*price;
		double discount=total*0.05;
		
		double finalamount=total-discount;
		
		System.out.println("BILL AMOUNT IS "+finalamount);
			
	}

}
