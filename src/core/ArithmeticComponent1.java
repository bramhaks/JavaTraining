package core;

public class ArithmeticComponent1 {
	//global variables
	public static int n1 = 0;
	public static int n2 = 0;
	
	//entry to the application.
	public static void main(String[] args) {
		System.out.println("inside main method ....");
		n1 = Integer.parseInt(args[0]);
		n2 = Integer.parseInt(args[1]);
		
		System.out.println("Sum of " + n1 + " and " + n2 + " = " + add());
		System.out.println("Difference of " + n1 + " and " + n2 + " = " + substract());
		System.out.println("Product of " + n1 + " and " + n2 + " = " + multiply());
		System.out.println("Division of " + n1 + " and " + n2 + " = " + divide());
	}
	
	//local varaiables
	public static int add() {
		System.out.println("inside add");
		
		return n1 + n2;
	}
	
	public static int substract() {
		System.out.println("inside substract ");
		
		return n1 - n2;
	}
	
	public static int multiply() {
		System.out.println("inside multiply");
		
		return n1 * n2;
	}
	
	public static int divide() {
		System.out.println("inside divide");
		
		return n1 / n2;
	}
}