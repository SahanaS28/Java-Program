package strings;

public class checkpprime
{
	public static void main(String[] args) 
	{
		
			int no=7;
			int count=0;
			for(int j=1;j<=no;j++)
			{
				if(no%j==0)
				{
					
					count++;
				}
			}
			if(count==2)
			{			
				System.out.print("prime number");
			}
			else
			{			
				System.out.print("not prime number");
			}
		
        		
	}

}
