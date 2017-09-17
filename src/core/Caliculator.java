package core;

public class Caliculator {
    //data member
	public int n1 = 0;
	public int n2 = 0;
	
	//Brahma updated comment.
	public int getN1() {
		System.out.println("n1 getter called ...");
		return n1;
	}

	public void setN1(int n1) {
		System.out.println("n1 setter called ...");
		this.n1 = n1;
	}

	public int getN2() {
		System.out.println("n2 getter called ...");
		return n2;
	}

	public void setN2(int n2) {
		System.out.println("n2 setter called ...");
		this.n2 = n2;
	}
	

	public Caliculator() {
		System.out.println("Default constructor of Caliculator is called ....");
	}

	public Caliculator(int n1, int n2) {
		System.out.println("Args constructor of Caliculator is called ....");
		this.n1 = n1;
		this.n2 = n2;
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
	
	public void invokeAllOperations() {
		add();
		substract();
		multiply();
		divide();
	}

	@Override
	public String toString() {
		return "Caliculator [n1=" + n1 + ", n2=" + n2 + "]";
	}
}