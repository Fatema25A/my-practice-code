import java.lang.*;
public class StringExample
{
	public static void main(String[] args)
	{
		String obj1=new String("AIUB");
		System.out.println(obj1);
		
		
		String s1="AIUB";
		System.out.println(s1);
		
		
		int age=21;
		String s2="I am "+age+" years old";
		System.out.println(s2);
		
		System.out.println(s1.length());
		System.out.println(s2.charAt(5));
		System.out.println(s1.equals(obj1));
		System.out.println(s1.compareTo(obj1));
		System.out.println(s2.indexOf('2'));
		System.out.println(s2.substring(3,9));
		System.out.println(s2.toUpperCase());
		System.out.println(s2.toLowerCase());
		
		String obj2=new String("ABC");
		String obj3=new String("ABC");
		
		if(obj2==obj3)
		{
			System.out.println("obj2=obj3");
		}else
		{
			System.out.println("obj2!=obj3");
		}
		String s3="IUB";
		String s4="IUB";
		
		if(s3==s4)
		{
			System.out.println("s3=s4");
		}
		else
		{
			System.out.println("s3!=s4");
		}
		
		
	}
}