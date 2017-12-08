package core.inheritance.abstrct;

public class Circle1 implements GraphicObjectInterface {

	@Override
	public void draw() {
		System.out.println("This is draw method inside circle1.");
	}

	@Override
	public void resize() {
		System.out.println("This is resize method inside circle1.");
	}

	@Override
	public void moveTo(int newX, int newY) {
		System.out.println("This is moveTo method inside circle1.");
	}
}