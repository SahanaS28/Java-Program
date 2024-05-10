package stringprograms;

public class reversesentence 
{
	public static void main(String[] args)
	{
	//m ui nelesmaI
	String st="I am selenium";
	String s=st.replace(" ","");
	int j=s.length()-1;
	
	for(int i=0;i<st.length();i++)
	{
		
		if(st.charAt(i)!=' ')
		{
			System.out.print(s.charAt(j--));
		}
		else 
		{
			System.out.print(st.charAt(i));
		}
		
	}
  }
}
