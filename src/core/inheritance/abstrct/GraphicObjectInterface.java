package core.inheritance.abstrct;

public interface GraphicObjectInterface {
	public void moveTo(int newX, int newY);
    
	//this is an abstract method
    public void draw();
    
    //this is an abstract method
    public void resize();
}
