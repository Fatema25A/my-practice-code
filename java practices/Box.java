import java.lang.*;
public class Box
{
	private double length,height,width;
	public Box()
	{
		System.out.println("Default cons calling");
		this.length=0.0;
		this.height=0.0;
		this.width=0.0;
	}
	public Box(double a,double b,double c)
	{
		System.out.println("para cons calling");
		this.length=a;
		this.height=b;
		this.width=c;
	}
	public void setlength(double x)
	{
		this.length=x;
	}
	public double getlength()
	{
		return this.length;
	}
	public void setheight(double y)
	{
		this.height=y;
	}
	public double getheight()
	{
		return this.height;
	}
	public void setwidth(double z)
	{
		this.width=z;
	}
	public double getwidth()
	{
		return this.width;
	}
	public void Show()
	{
		System.out.println("value of length: "+this.length);
		System.out.println("value of height: "+this.height);
	System.out.println("value of width: "+this.width);
	}
	
}