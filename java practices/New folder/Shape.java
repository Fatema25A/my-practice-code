import java.lang.*;
public class Shape
{
	private int x;
	
	public Shape()
	{
		System.out.println("Shape D.C called");
	}
	public Shape(int a)
	{
		this.x=a;
	}
	public void setX(int b)
	{
		this.x=b;
	}
	public int getX()
	{
		return this.x;
	}
	public void Area()
	{
		System.out.println("Shape has no area");
	}
}
	