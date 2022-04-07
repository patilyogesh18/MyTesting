package String_Study;
import java.util.*;
public class DataValidation {

	public static void main(String[] args) 
	{
		Scanner sc1=new Scanner(System.in);
		System.out.println("ENTER NAME ");
		
		String name=sc1.nextLine();
		String username=name.trim();
		if(!username.isEmpty()) {
		   System.out.println("ENTER EMAIL ");
		   String email=sc1.next();
		   if(email.contains("@") && email.contains(".")) {
			   System.out.println("ENTER PASSWORD ");
			   String password=sc1.next();
			     if(password.length()>=5) {
			    	 System.out.println("CONFIRM PASSWORD  ");
			    	 String confirm=sc1.next();
			    	   if(password.equals(confirm)) {
			    		   System.out.println("WELCOME "+username.toUpperCase());
			    	   }else {
			    		   System.out.println("PASSWORD NOT MATCHING ");
			    	   }
			    	 
			     }else {
			    	 System.out.println("MINIMUM 5 CHARACTER ARE REQUIRED ");
			     }
		   }else {
			   System.out.println("INVALID EMAIL ID ");
		   }

	}else {
		System.out.println("INVALID NAME ");
	}

}
	}
	
	
