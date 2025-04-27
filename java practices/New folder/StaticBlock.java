import java.lang.*;
public class StaticBlock
{
	public static int x;//class variable
	
	public StaticBlock()
	{
		System.out.println("Default cons calling!");
	}
	//static block 
	static
	{
		System.out.println("Static block1 calling");
	}
	static
	{
		System.out.println("Static block2 calling");
	}
	public static void main(String[] args)
	{
		StaticBlock obj1=new StaticBlock();
		StaticBlock obj2=new StaticBlock();
	}
}
		
	