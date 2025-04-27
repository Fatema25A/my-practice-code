import java.lang.*;
public class JavaClass
{
	boolean b1;
	boolean b2=true;
	int i1;
	int i2;
	public JavaClass() //Default constructor
	{
		System.out.println("Default cons calling");
		this.b1=false;
		b2=false;
		i1=5;
	}
	public JavaClass(int a,int b)
	{
		System.out.println("Two  para cons calling");
		this.i1=a;
		i2=b;
	}
	public JavaClass(int x,int y,boolean z)
	{
		System.out.println("Three para cons calling");
		this.i1=x;
		this.i2=y;
		this.b2=z;
	}
	public void Show()
	{
		System.out.println("Value of b1: "+this.b1);
		System.out.println("Value of b2: "+this.b2);
		System.out.println("Value of i1: "+this.i1);
		System.out.println("Value of i2: "+this.i2);
	}
	public static void main(String[] args)
	{
		JavaClass obj1=new JavaClass();
		obj1.Show();
		System.out.println();
		System.out.println("--------------------------------------");
		JavaClass obj2=new JavaClass(5,6);
		obj2.Show();
		System.out.println();
		System.out.println("--------------------------------------");
		JavaClass obj3=new JavaClass(10,20,true);
		obj3.Show();
	}
}