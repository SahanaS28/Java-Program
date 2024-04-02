package strings;

import java.util.Arrays;

public class Anagram 
{
	public static void main(String[] args) {
		String s="race";
		String s1="care";
		if(s.length()!=s1.length())
		{
			System.out.println("not Anagram");
		}
		else
		{
			char[] c1=s.toCharArray();
			char[] c2=s1.toCharArray();
			Arrays.sort(c1);
			Arrays.sort(c2);
			boolean flag=false;
			for (int i = 0; i < c1.length; i++)
			{
				if(c1[i]==c2[i])
				{
					flag=true;
				}
				else
				{
					flag=false;
					break;
				}
				
			}
			if(flag==true)
			{
				System.out.println("Anagram");
			}
			else
			{
				System.out.println("not Anagram");
			}
		}
	}

}
