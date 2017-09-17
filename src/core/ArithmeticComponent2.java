package core;

public class ArithmeticComponent2 {
	// instance vailables
	public int n1 = 0;
	public int n2 = 0;

	// entry to the application.
	public static void main(String[] args) {
		System.out.println("inside main method ....");
		ArithmeticComponent2 obj = new ArithmeticComponent2();

		obj.n1 = Integer.parseInt(args[0]);
		obj.n2 = Integer.parseInt(args[1]);

		obj.add();
		obj.substract();
		obj.multiply();
		obj.divide();
	}

	public int add() {
		int result = n1 + n2;
		System.out.println("Sum of " + n1 + " and " + n2 + " = " + result);
		return result;
	}

	public int substract() {

		int result = n1 - n2;
		System.out.println("Difference of " + n1 + " and " + n2 + " = "
				+ result);
		return result;
	}

	public int multiply() {

		int result = n1 * n2;
		System.out.println("Product of " + n1 + " and " + n2 + " = " + result);
		return result;
	}

	public int divide() {
		int result = n1 / n2;
		System.out.println("Division of " + n1 + " and " + n2 + " = " + result);
		return result;
	}
}