package core.inheritance.abstrct;

public class Circle extends GraphicObject {

	@Override
	public void moveTo(int newX, int newY) {
		System.out.println("moveTo method in circle has been overriden with different implementation.");
	}
	
	public void draw() {
		System.out.println("This is draw method inside circle.");
	}

	public void resize() {
		System.out.println("This is resize method inside circle.");
	}
}