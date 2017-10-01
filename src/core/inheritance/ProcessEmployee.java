package core.inheritance;

public class ProcessEmployee {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*Employee emp = new Employee();
		emp.setFirstName("Vinay");
		emp.setLastName("G");
		emp.setMiddleName("Reddy");
		emp.setGender("Male");*/
		
		Programmer programmer = new Programmer();
		programmer.setBonus(34535345.33F);
		programmer.setFirstName("Vinay");
		programmer.setLastName("G");
		programmer.setMiddleName("Reddy");
		programmer.setGender("Male");
		
		System.out.println(programmer);
		System.out.println(programmer.newMethod());
	}
}
