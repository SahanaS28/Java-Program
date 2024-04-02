package pattern;

public class patter7 
{
	public static void main(String[] args) 
	{
		int n=5;

		for (int i = 0; i <=n; i++) 
		{
			for (int j = i; j <n; j++) 
			{
				System.out.print(" ");//one space	
			}
			for (int j = 1; j <=i; j++) 
			{
				System.out.print(j+" "+i);
			}
			System.out.println();		
		}
	}

}
