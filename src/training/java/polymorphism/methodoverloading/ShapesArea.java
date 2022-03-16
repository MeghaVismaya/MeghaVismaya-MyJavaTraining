package training.java.polymorphism.methodoverloading;

public class ShapesArea {

	private double areaCircle;
	private float areaRectangle;
	private float areaSquare;
	private double PI=3.14;
	
	public void calculateArea(double radius)
	{
		areaCircle=PI*radius*radius;
	}
	public void calculateArea(float length,float breadth)
	{
		areaRectangle=length*breadth;
	}
	public void calculateArea(float side)
	{
		areaSquare=side * side;
	}
	public void display()
	{
		System.out.println("Area of Circle: "+areaCircle);
		System.out.println("Area of Rectangle: "+areaRectangle);
		System.out.println("Area of Square: "+areaSquare);
	}
	public static void main(String[] args) {
		ShapesArea area=new ShapesArea();
		area.calculateArea(5d);
		area.calculateArea(4f, 3f);
		area.calculateArea(6f);
		area.display();
	}
}

