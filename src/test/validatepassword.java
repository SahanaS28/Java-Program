package test;

public class validatepassword {
	String s="Rdh34aa950";
	boolean flag=true;
	int up=0;
	int lc=0;
	int digit=0;
	
	if(s.length()>=8 && s.length()<=16 && !s.contains(" "))
	{
			for(int i=0;i<s.length()-1;i++)
			{
				if(s.charAt(i)==s.charAt(i+1))
				{
                   flag=false;
                   break;
				}
			}
			for(int i=0;i<s.length();i++)
				{
				
					if(Character.isDigit(s.charAt(i)))
					{
					 digit++;
					}
					else if(Character.isUpperCase(s.charAt(i)))
					{
						 up++;
					}
					else if(Character.isLowerCase(s.charAt(i)))
					{
						 lc++;
					}
					
				}
			if(digit<1||lc<1||up<1)
			{
				flag=false;
			}
			
			
	}
	else
	{
		flag=false;
	}
	if(flag==true)
		{
			System.out.println("valid password");
		}
	else
		{
			
			System.out.println("Invalid password");
			
		}
	
	
}
}
