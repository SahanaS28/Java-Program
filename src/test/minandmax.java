package test;

public class minandmax
{
	public static void main(String[] args)
	{
		int a[]= {4,0,5,1,0,3,5};
		
		
		for (int i = 0; i < a.length; i++)
		{
			for (int j = i+1; j < a.length; j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
				
			}
			//System.out.print(a[i]);
			
		}
		System.out.println("1st and 2nd minimum numbers are");
		System.out.print(a[0]+" ");
		if(a[0]==a[1])
		{
			System.out.print(a[2]);
		}
		else
		{
			System.out.print(a[1]);
		}
		
		for (int i = 0; i < a.length; i++)
		{
			for (int j = i+1; j < a.length; j++)
			{
				if(a[i]<a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
				
			}
			//System.out.print(a[i]);
			
			
		}
		System.out.println();
		System.out.println("1st and 2nd maximum numbers are");
		System.out.print(a[0]+" ");
		if(a[0]==a[1])
		{
			System.out.print(a[2]);
		}
		else
		{
			System.out.print(a[1]);
		}
	}

}
