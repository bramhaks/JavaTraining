package core.basics;

public class ArraysEx {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String name = new String("Vinay");
		
		//array - more than one value of the same data type
		//creating
		String names[] = new String[3];   //size of the array 0,1,2
		//storing the value
		names[0] = "Vinay";
		names[1] = "Smitha";
		names[2] = "Cherry";
		
		System.out.println("Length of array ="+ names.length);
		
		System.out.println(names[1]+" "+ names[0]+" "+names[2]);
		
		
		// ========= Loop and StringBuffer example ===========
		//for loop.
	    StringBuffer sb = new StringBuffer();
		for(int i=0; i < names.length; i++ ){
			//the code that has to be executed repeatedly.
			sb.append(names[i]);
			sb.append(" ");
		}
		
		System.out.println("Final names = "+ sb);
		
		int numbers[] = new int[5];
		numbers[0] = 10;
		numbers[1] = 20;
		numbers[2] = 30;
		numbers[3] = 40;
		numbers[4] = 50;
		
		int sum = numbers[0]+ numbers[1] + numbers[2] + numbers[3] + numbers[4];
		System.out.println(sum);
		int result = 0;
		for(int i=0; i < numbers.length; i++ ){
			result = result + numbers[i];
		}
		
		System.out.println("Result = "+ result);
	}

}
