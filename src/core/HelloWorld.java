package core;
// Class is generic Generic 
// Men - 
// Object - specific and its derived from classs.

public class HelloWorld {  //start

    //Java class =  variables (data)  + methods (behavior) 
	public static void main(String[] args) {
		//System.out.println("Hello " + args[0] + "," + args[1] + " and "+ args[2]);
		int n1 = Integer.parseInt(args[0]);
		int n2 = Integer.parseInt(args[1]);
		
		System.out.println("Enter main ....");
		//classname objectname = new classname;
		Calc calc = new Calc();
		//calc.add(40, 50);
		calc.add(n1, n2);
		System.out.println("Exit of main ...");
	}
}  