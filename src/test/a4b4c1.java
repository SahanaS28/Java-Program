package test;

public class a4b4c1 {
public static void main(String[] args) {
	String s="aabbbaabc";
	for (int i = 0; i < s.length(); i++)
	{
		int count=0;
		for (int j = 0; j < s.length(); j++) 
		{
			if(s.charAt(i)==s.charAt(j))
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
		if(count>=1)
		{
		System.out.print(s.charAt(i)+""+count);
		}
	}
}
}
