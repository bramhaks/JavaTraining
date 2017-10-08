package core.inheritance;

//Base or Super class.
public class Employee {
	private String firstName;
	private String lastName;
	private String middleName;
	private int age;
	private String gender;
	
	protected String getFirstName() {
		return firstName;
	}
	
	//no modifier
	void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	protected String getLastName() {
		return lastName;
	}
	protected void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	protected String getMiddleName() {
		return middleName;
	}
	protected void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	
	protected int getAge() {
		return age;
	}
	
	protected void setAge(int age) {
		this.age = age;
	}
	
	protected String getGender() {
		return gender;
	}
	protected void setGender(String gender) {
		this.gender = gender;
	}
}
