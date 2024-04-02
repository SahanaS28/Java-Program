package strings;

public class H_e__l___l____o 
{

	public static void main(String[] args) 
	{
		
		String s="Hello";
		for(int i=0;i<s.length();i++)
		{
			
			for(int j=0;j<i;j++)
			{
				System.out.print(" ");
			}
			System.out.print(s.charAt(i));
		}
		
	}
}
