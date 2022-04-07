package methods;

public class Demo {

	public static void main(String[] args) {
		System.out.println("RUNNING MAIN METHOD ");
		test1();
		test2();
		test3();

	}
	
	static void test1() {
		System.out.println("THIS IS STATIC TEST1 METHOD "+'A'+'B');
	}
	
	static void test2() {
		System.out.println("THIS IS STATIC TEST2 METHOD");
		System.out.println('A'+'B');
	}
	
	static void test3() {
		double a=89.52;
		long b=32333333333333333L;
		double c=a+b;
		System.out.println("ADDITION IS "+c);
		double c1=a/b;
		System.out.println("DIVISON IS "+c1);
	}

}
