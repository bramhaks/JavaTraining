package core.inheritance.abstrct;

public abstract class GraphicObject {
	int x, y;
    
	//this is a concrete method.
	void moveTo(int newX, int newY) {
    	System.out.println("Moving object to position x = " + newX + " y =" + newY);
    }
    
	//this is an abstract method
    public abstract void draw();
    
    //this is an abstract method
    public abstract void resize();
}