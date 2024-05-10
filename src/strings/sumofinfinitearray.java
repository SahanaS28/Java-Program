package strings;

import java.util.Scanner;

public class sumofinfinitearray //sum of dynamic infinite array
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int size=sc.nextInt();
		int a[]=new int[size];
		int sum=0;
		System.out.println("enter the elements");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
			 sum=sum+a[i];
		}
		System.out.println("the total sum is "+sum);
	}
	
	
	

}
