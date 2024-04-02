package map;


import java.util.Hashtable;
import java.util.Map.Entry;

public class collection {

	public static void main(String[] args) {
		
		Hashtable<Integer, Object> set=new Hashtable<Integer, Object>();
		set.put(10, 'A');
		set.put(40, "hi");
		System.out.println(set);
		System.out.println(set.containsKey(10));
		System.out.println(set.containsValue("hi"));
		System.out.println(set.replace(10, "hello"));
		
		for(Entry<Integer,Object> m:set.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}
}
