package core;

public class ArithmeticComponent6 {
	
	public static void main(String[] args) {
		System.out.println(">>> Enter main method ....");
		
		Caliculator calc1 = new Caliculator(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
		calc1.invokeAllOperations();
		
		Caliculator calc2 = new Caliculator(Integer.parseInt(args[2]), Integer.parseInt(args[3]));
		calc2.invokeAllOperations();
		
		Caliculator calc3 = new Caliculator(Integer.parseInt(args[4]), Integer.parseInt(args[5]));
		calc3.invokeAllOperations();
		
		System.out.println("Now lets print data of the object ......");
		System.out.println(calc1);
		System.out.println(calc2);
		System.out.println(calc3);
		
        System.out.println("Exit main method ....");
	}
}