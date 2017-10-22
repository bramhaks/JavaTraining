package core.basics;

public class DataTypes {
	
	public static void main(String[] args) {
		//https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html
		//data types.
		//DataTypes dt = new DataTypes();
		//dt.primitives();
		primitives();
		System.out.println("--------------");
		wrappertypes();
	}
	
	
	public  static void primitives(){
		int a = 10;
		float b = 10.5f;
		double c = 1245620.54564654646546;
		String d = "Hello";
		boolean e = false;
		char f = 'H';
		short g = 1;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
	}
	
	//https://docs.oracle.com/javase/tutorial/java/data/numberclasses.html
	public static void wrappertypes(){
		Integer a = new Integer(10);
		Float b = new Float(10.5);
		Double c = new Double(1245620.54564654646546);
		String d = new String("Hello");
		Boolean e = new Boolean(false);
		//Char f = new Char('H');
		//Short g = new Short(1);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
	}
	
	//wrapper to primitive conversion.
	//String, StringBuffer
}
