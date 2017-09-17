package core;

public class Calc {
	
	public void add(int a, int b) {
		System.out.println("Inside add of Calc");
		int result = a + b;
		
		System.out.println("Addition of "+ a + " and "+ b +" is = " + result);
	}
	
	public void testMe() {
		add(10, 20);
	}
}