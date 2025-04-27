import java.lang.*;
public class ArrayExample{
	public static void main(String[] args)
	{
		//1st approach
		//size known,element unknown
		int array1[]=new int[5];
		int []array2=new int[5];
		
		array1[0]=2;
		array2[1]=4;
		
		System.out.println(array1[0]+" "+array2[1]);
		
		
		//2nd approach
		//size unknown,elements unknown
		int array3[];
		int size=array2[1]/2;
		array3=new int[size];
		
		array3[0]=5;
		array3[1]=10;
		System.out.println(array3[0]+" "+array3[1]);
		
		//3rd approach
		//size unknown,elements known
		int array4[]=new int[] {1,2,3,4};
		System.out.println(array4[2]);
		for(int i=0;i<4;i++)
		{
			System.out.print(array4[i]+" ");
		}
	}
}