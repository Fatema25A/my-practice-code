import java.lang.*;
public class Example
{
	double length,height,width;//by default public
	public Example()
	{
		System.out.println("Default cons calling");
		this.length=0.0;
		this.height=0.0;
		this.width=0.0;
	}
	public Example(double length,double height,double width)
	{
		System.out.println("Para cons calling");
		this.length=length;
		this.height=height;
		this.width=width;
	}
	public void Show()
	{
		System.out.println("Showing");
		System.out.println("value of length: "+this.length);
		System.out.println("value of height: "+this.height);
		System.out.println("Value of width: "+this.width);
	}
	public double volumecalculation()
	{
		double v=this.length*this.height*this.width;
		return v;
	}
	public static void main(String[] args)
	{
		Example obj1=new Example();
		obj1.Show();
		Example obj2=new Example(2.2,3.3,4.4);
		obj2.Show();
		double value2=obj2.volumecalculation();
		System.out.println("Value2: "+value2);
	}
}