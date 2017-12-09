package core.basics;

//Opps concepts - Plymorphism
				// compile time is nothing but method overloading
				//run time 
public class MethodOverloading {

	public static int add(int n1, int n2){
		return n1 + n2;
	}
	
	public static int add(int n1, int n2, int n3){
		return n1 + n2 + n3;
	}
	
	public static double add(double n1, double n2){
		return n1 + n2;
	}
	
	public static void main(String[] args) {
		//int n1 = Integer.parseInt(args[0]);
		//int n2 = Integer.parseInt(args[1]);
		System.out.println(add(40, 50));
		System.out.println(add(40, 50, 60));
		System.out.println(add(40.0, 50.0));
	}
}
