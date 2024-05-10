package stringprograms;

	import java.util.*;

	public class balancedstring 
	{

		public static void main(String[] args) {
			String s="[()]";
			ArrayList<Character> l=new ArrayList<Character>();
			for(int i=0;i<s.length();i++)
			{
				if(l.size()!=0&& (s.charAt(i)=='}'&& l.get(l.size()-1)=='{'
					||s.charAt(i)==']'&& l.get(l.size()-1)=='['
					||s.charAt(i)==')'&& l.get(l.size()-1)=='('))
				    {
					l.remove(l.size()-1);
			        }
				
				   else
				    {
					l.add(s.charAt(i));
				    }
			}
			if(l.size()==0)
			{
				System.out.println("given string is balanced");
			}
			else
			{
				System.out.println("given string is not balanced");
			}
			
			
		}
	}
	        


