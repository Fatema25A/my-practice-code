import java.lang.*;

public class fatema
{
	public static void main(String[] args)
	{
		byte b1=25;
	System.out.println("value of b1: "+b1);
	    int i1;
		i1=b1;//implicit
		System.out.println("value of i1: "+i1);
		int i2=50;
		System.out.println("value of i2: "+i2);
		long l1;
		l1=i2;
		System.out.println("value of l1: "+l1);
		double d1=2.55;
		System.out.println("value of d1: "+d1);
		float f1;
		f1=(float)d1;//explicit
		System.out.println("value of f1: "+f1);
		float f2=3.09f;
		System.out.println("value of f2: "+f2);
		byte b2;
		b2=(byte)f2;//explicit
		System.out.println("value of b2: "+b2);
		String s1="123";//Non primitive date type
		int i3;
		i3=Integer.parseInt(s1);
		System.out.println("value of i3: "+i3);//using wrapper class to convert from non primitive  data type to primitve data type
		double d2=Double.parseDouble(s1);
		System.out.println("value of d2: "+d2);
	}
}