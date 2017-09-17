package core;

public class ArithmeticComponent4 {
	
	public static void main(String[] args) {
		System.out.println(">>> Enter main method ....");
		
		//2.data initialization
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		
		Caliculator calc = new Caliculator(a, b);
		
		//3.invoke methods
		calc.add();
		calc.substract();
		calc.multiply();
        calc.divide();
        System.out.println("Exit main method ....");
	}
}