package stringprograms;

public class removeduplicatewords {
	public static void main(String[] args) 
	{
		String st="Hi Hello Hello to Hi";
		String[]s=st.split(" ");
		
		for (int i = 0; i < s.length; i++) 
		{
			int count=0;
		for (int j = 0; j < s.length; j++)
		{
		   if(s[i].equals(s[j]))
		   {
			if(i>j)
			{
				break;
			}
			else
			{
			count++;
			}
		   }
		}
		
		if(count==1)
		{
			System.out.println(s[i]);
		}
	  }		
	}
}
