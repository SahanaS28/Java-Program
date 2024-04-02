package Set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class tree {

	public static void main(String[] args) {
		TreeSet<Integer> set=new TreeSet<Integer>();
		set.add(10);
		set.add(30);
		set.add(89);
		set.add(90);
		set.add(10);
		
		System.out.println(set);
		System.out.println(set.descendingSet());
		
		Iterator<Integer> i = set.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
}
}
