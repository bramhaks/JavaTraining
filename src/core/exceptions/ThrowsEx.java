package core.exceptions;

public class ThrowsEx {

	private static int stringToNumber(String s)  {
		try {
			return Integer.parseInt(s);
		} catch (NumberFormatException e) {
			e.printStackTrace();
			return 0;
		}
	}

	public static void main(String[] args) {
		int n1 = 1, n2 = 0;
		System.out.println("** 1 **");
		n1 = stringToNumber("koti");
		System.out.println("** 2 **");
		n2 = stringToNumber("40");
		System.out.println("** 3 **");

		int result = n1 + n2;
		System.out.println("Result = " + result);
	}

}
