package core;

public class ArithmeticComponent5 {
	
	public static void main(String[] args) {
		System.out.println(">>> Enter main method ....");
		
		//2.data initialization
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		
		Caliculator calc = new Caliculator();
		
		calc.setN1(a);
		calc.setN2(b);
		
		//3.invoke methods
		calc.add();
		calc.substract();
		calc.multiply();
        calc.divide();
        System.out.println("Exit main method ....");
	}
}