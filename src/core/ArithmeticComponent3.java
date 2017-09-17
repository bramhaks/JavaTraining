package core;

public class ArithmeticComponent3 {
	
	public static void main(String[] args) {
		System.out.println("Enter main method ....");
		//1.create an object
		Caliculator calc = new Caliculator();
		//2.data initialization
		calc.n1 = Integer.parseInt(args[0]);
		calc.n2 = Integer.parseInt(args[1]);
		//3.invoke methods
		calc.add();
		calc.substract();
		calc.multiply();
        calc.divide();
        System.out.println("Exit main method ....");
	}
}