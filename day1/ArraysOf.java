package day1;
import java.util.Scanner;
import java.util.Arrays;
public class ArraysOf {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int n=sc.nextInt();
		int a1[]=new int[n];
		System.out.println("Enter the elements in first array");
		for (int i=0;i<n;i++)
		{
			a1[i]=sc.nextInt();
		}
		int []a2=Arrays.copyOf(a1,n);
		System.out.println("copied array ");
		for (int i=0;i<n;i++)
		{
			System.out.print(a2[i]+" ");
		}
	}
 

}
