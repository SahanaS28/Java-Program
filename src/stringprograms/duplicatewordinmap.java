
package stringprograms;

import java.util.HashMap;
import java.util.Map.Entry;

public class duplicatewordinmap {
	public static void main(String[] args)
	{
		String st="hi hello hello to";
		String[] s=st.split(" ");
		HashMap<String, Integer> h=new HashMap<String, Integer>();
		for(int i=0;i<s.length;i++)
		{
			if(h.containsKey(s[i]))
			{
			h.put(s[i], h.get(s[i])+1);
			}
			else
				 
			{
				h.put(s[i], 1);
			}
		} 
		for(Entry<String, Integer> m:h.entrySet())
		{
			if(m.getValue()>1)
			{
				System.out.println(m.getKey()+" "+m.getValue());
			}
		}
	}
}
