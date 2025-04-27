import java.lang.*;
public class Circle extends Shape
{
	public Circle() 
	{
		System.out.println("Circle D.C called");
	}
	public Circle(int a)
	{
		super(a);//or, super.x=a
		System.out.println("Circle P.C called");
	}
	public void Area()
	{
		double a=3.1416*super.getX()*super.getX();
		System.out.println(a);
	}
}
		
		