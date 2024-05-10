kjpackage test;



public class maxlengthofwordinagivenstring 
{
	public static void main(String[] args) 
	{
		String st="I am from Bangalore city";
		String[] s=st.split(" ");
		String max=s[0];
		
		for (int i = 0; i < s.length; i++)
		{
			if(s[i].length()>max.length())
			{
				max=s[i];
				
			}
			
		}
		for(int i=0;i<s.length;i++)
		{
			if(s[i].length()==max.length())
			{
				System.out.println(s[i]+" "+s[i].length());
			}
		}
		
	}

}
