import java.lang.*;
public class Variable
{
	int y=20;//instance variable
	public static int z=30;//class variable
	
	public static void main(String[] args)
	{
		int x=10;//local variable
		System.out.println("Local variable: "+x);
		
		Variable obj1=new Variable();
		System.out.println("Intance variable: "+obj1.y);
		System.out.println("Class variable: "+Variable.z);
	}
}
		
		
	