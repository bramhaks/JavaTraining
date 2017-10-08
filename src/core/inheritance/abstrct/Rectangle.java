package core.inheritance.abstrct;

public class Rectangle extends GraphicObject {

	@Override
	public void draw(){
		System.out.println("This is draw method inside rectangle.");
	}
	
	@Override
	public void resize() {
		System.out.println("This is resize method inside rectangle.");
	}
}