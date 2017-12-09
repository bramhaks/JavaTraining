package core.exceptions;

public class ExceptionEx {

	public static int add(int n1, int n2) {
		return n1 + n2;
	}

	public static void main(String[] args) {
		int n1 = 0, n2 = 0, sum = 0, div = 0;
		try {
			n1 = Integer.parseInt(args[0]);
			n2 = Integer.parseInt(args[1]);
			sum = add(n1, n2);
			div = n1 / n2;
		} catch (NumberFormatException e) {
			e.printStackTrace();
			System.out.println("1 Three is an excepiton " + e.getMessage()
					+ " >> ignore it");
			n2 = n1;
			sum = add(n1, n2);
		} catch (ArithmeticException e) {
			e.printStackTrace();
			System.out.println("2. Three is an excepiton " + e.getMessage()
					+ " >> ignore it");
			n2 = n1;
			div = n1 / n2;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("3. Three is an excepiton " + e.getMessage()
					+ " >> ignore it");
		}

		System.out.println("sum="+sum+" div="+div);
	}
}
