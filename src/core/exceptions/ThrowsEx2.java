package core.exceptions;

public class ThrowsEx2 {

	private static int stringToNumber(String s) throws NumberFormatException {
			return Integer.parseInt(s);
	}

	public static void main(String[] args) {
		int n1 = 1, n2 = 0;
		try{
			System.out.println("** 1 **");
			n1 = stringToNumber("koti");
			System.out.println("** 2 **");
			n2 = stringToNumber("40");
			System.out.println("** 3 **");
		}catch(NumberFormatException e){
			e.printStackTrace();
		}

		int result = n1 + n2;
		System.out.println("Result = " + result);
	}

}
