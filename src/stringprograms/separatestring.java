package stringprograms;

public class separatestring 
{

	public static void main(String[] args) {
		String st="a1b&3$c";
		String alp="";
		String num="";
		
		String spc="";
		for (int i = 0; i < st.length(); i++) 
		{
			char c=st.charAt(i);
			if(c>='A'&& c<='Z'||c>='a'&& c<='z')
			{
				alp=alp+c;
				
			}
			else if (c>='0'&& c<='9') 
			{
				num=num+c;
				
			}
			else
			{
			 spc=spc+c;	
			}
			
		}
		System.out.println(alp+num+spc);
	}
}
