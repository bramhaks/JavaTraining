package core.inheritance.abstrct;

public class Circle extends GraphicObject {

	@Override
	public void draw() {
		System.out.println("This is draw method inside circle.");
	}

	@Override
	public void resize() {
		System.out.println("This is resize method inside circle.");
	}
}