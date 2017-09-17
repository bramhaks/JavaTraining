package core;

public class ArithmeticComponent {

	//entry to the application.
	public static void main(String[] args) {
		System.out.println("inside main method ....");
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		
		System.out.println("Sum of " + a + " and " + b + " = " + add(a, b));
		System.out.println("Difference of " + a + " and " + b + " = " + substract(a, b));
		System.out.println("Product of " + a + " and " + b + " = " + multiply(a, b));
		System.out.println("Division of " + a + " and " + b + " = " + divide(a, b));
	}
	
	//local varaiables
	public static int add(int n1, int n2) {
		System.out.println("inside add");
		
		return n1 + n2;
	}
	
	public static int substract(int n1, int n2) {
		System.out.println("inside substract");
		
		return n1 - n2;
	}
	
	public static int multiply(int n1, int n2) {
		System.out.println("inside multiply");
		
		return n1 * n2;
	}
	
	public static int divide(int n1, int n2) {
		System.out.println("inside divide");
		
		return n1 / n2;
	}
}