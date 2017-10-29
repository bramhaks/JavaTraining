package core.basics;

public class StringBufferDemo {

    //1 byte = 8 bits
	/// I/O streams(8 bits), Reader/Writer(16 bit)
	public static void main(String[] args) {
		String fName = "Vinay";
		String mName = "Reddy";
		String lName = "G";
		//mutable vs immutable
		String fullName = fName + " " +  mName + " " + lName;
		System.out.println(fullName);
		
		
		StringBuffer name = new StringBuffer();
		name.append(fName);
		name.append(" ");
		name.append(mName);
		name.append(" ");
		name.append(lName);
		System.out.println(name.toString());
	}
}