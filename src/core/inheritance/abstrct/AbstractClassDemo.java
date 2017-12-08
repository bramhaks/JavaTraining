package core.inheritance.abstrct;

public class AbstractClassDemo {

	//https://docs.oracle.com/javase/tutorial/java/IandI/abstract.html
	//https://roseindia.net/java/example/java/core/java-abstract-class-example.shtml
	public static void main(String[] args) {
		//Circle graphic1 = new Circle();
		//Parent c = new Child();
		GraphicObject graphic1 = new Circle();
		graphic1.moveTo(10, 20);
		graphic1.draw();
		graphic1.resize();
		
		//Rectangle graphic2 = new Rectangle();
		GraphicObject graphic2 = new Rectangle();
		graphic2.moveTo(10, 20);
		graphic2.draw();
		graphic2.resize();
		
		System.out.println("===============================");

		Circle1 circle1 = new Circle1();
		circle1.moveTo(10, 20);
		circle1.draw();
		circle1.resize();
		
		Rectangle1 rectangle1 = new Rectangle1();
		rectangle1.moveTo(10, 20);
		rectangle1.draw();
		rectangle1.resize();
	}
}
