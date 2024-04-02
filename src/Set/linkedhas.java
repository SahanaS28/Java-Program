package Set;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class linkedhas {

	
	public static void main(String[] args) {
		LinkedHashSet<Object> set=new LinkedHashSet<Object>();
		set.add('A');
		set.add(null);
		set.add("hi");
		set.add('A');
		set.add(10);
		System.out.println(set);
		
		ArrayList<Object> list=new ArrayList<Object>(set);
		list.add('A');
		list.add(null);
		
		Iterator<Object> i = list.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}
	}


