package strings;

public class primenumber {
public static void main(String[] args) {
	
	int pcount=0;
	for(int i=1;i<=30;i++)
	{
		int no=i;
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
			pcount++;
			
			System.out.print( no+" ");
		}
	}
}
}
