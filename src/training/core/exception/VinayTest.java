package training.core.exception;

public class VinayTest {

	public static void printInput(String name){
		System.out.println("The input received = " + name);
	}
	
	//access specifier - public, private, protected
	//static - 
	//return type - int, String,..... void
	// name of the method(decalre arguments)
	//{
	// logic 
	//}
	public static void main(String[] args) {
		String name = args[0];
		printInput(name);
	}
}