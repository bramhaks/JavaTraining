package core.inheritance;

//Sub class extends Super class
public class Programmer extends Employee {
	private float bonus;
	
	public float getBonus() {
		return bonus;
	}
	
	public void setBonus(float bonus) {
		this.bonus = bonus;
	}

	@Override    //annotations
	public String toString() {
		return "Programmer [bonus=" + bonus + ", firstName="
				+ getFirstName() + ", lastName=" + getLastName()
				+ ", middleName=" + getMiddleName() + ", age="
				+ getAge() + ", gender=" + getGender() + "]";
	}
	
	public String newMethod(){
		return "This is a new method";
	}
}
