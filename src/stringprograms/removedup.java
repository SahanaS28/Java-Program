package stringprograms;

import java.util.HashMap;
import java.util.Map.Entry;

public class removedup 
{
	public static void main(String[] args)
	{
		String st="Tester";
		String s=st.toLowerCase();
		HashMap<Character, Integer> h=new HashMap<Character, Integer>();
		for(int i=0;i<s.length();i++)
		{
			if(h.containsKey(s.charAt(i)))
			{
			h.put(s.charAt(i), h.get(s.charAt(i))+1);
			}
			else
			{
				h.put(s.charAt(i), 1);
			}
		} 
		for(Entry<Character, Integer> m:h.entrySet())
		{
			if(m.getValue()==1)
			{
				System.out.println(m.getKey()+" "+m.getValue());
			}
		}
	}

}
