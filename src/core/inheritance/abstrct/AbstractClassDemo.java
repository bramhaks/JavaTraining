package core.inheritance.abstrct;

public class AbstractClassDemo {

	public static void main(String[] args) {
		//Circle graphic1 = new Circle();
		//Parent c = new Child();
		GraphicObject graphic1 = new Circle();
		graphic1.moveTo(10, 20);
		graphic1.draw();
		graphic1.resize();
		System.out.println("===============================");
		
		//Rectangle graphic2 = new Rectangle();
		GraphicObject graphic2 = new Rectangle();
		graphic2.moveTo(10, 20);
		graphic2.draw();
		graphic2.resize();
	}
}
