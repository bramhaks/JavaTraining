package core.basics;

public class StringEx {

	public static void main(String[] args) {
		String name1 = "Vinay";    //String literal
		String name2 = new String("Vinay");   // class
		
		String name3 = name2.toString();
		
		String name4 = "Vinay";
		
		String name5 = new String ("Vinay");
		
		//address/ reference          ==
		//value                       equals

		if(name1 == name4){
			System.out.println("name1 and name4 address is same");
		} else {
			System.out.println("name1 and name4 address is not same");
		}
		
		if(name2 == name5){
			System.out.println("name2 and name5 address is same");
		} else {
			System.out.println("name2 and name5 address is not same");
		}
		
		if(name2.equals(name5)){
			System.out.println("name2 and name5 value is same");
		} else {
			System.out.println("name2 and name5 value is not same");
		}
		
		
		if(name1 == name2){
			System.out.println("name1 and name2 address is same");
		} else {
			System.out.println("name1 and name2 address is not same");
		}
		
		
		if(name1.equals(name2)){
			System.out.println("name1, name2.value same");
		} else {
			System.out.println("name1, name2.value not same");
		}
		
		if(name3 == name2){
			System.out.println("name3 and name2 address is same");
		} else {
			System.out.println("name3 and name2 address is not same");
		}
		
		
		if(name3.equals(name2)){
			System.out.println("name3, name2.value same");
		} else {
			System.out.println("name3, name2.value not same");
		}
		
		System.out.println(name1.toUpperCase());
		System.out.println(name1.toLowerCase());
		
		String name = "Vinay Kumar Reddy G";
		
		System.out.println(name.indexOf("Kumar"));
		
		String name6 = "Smitha G";
		
		if(name.contains("G") && name6.contains("G")){
			System.out.println("From same family");
		} else {
			System.out.println("From different family");
		}
		
	}

}
