package program;

import java.util.LinkedList;

public class pgm2 {

	public static void main(String[] args) {
		LinkedList<Object> a=new LinkedList<Object>();
		a.add(50);
		a.add(90);
		a.add(20);
		a.add(35);
		a.add("helo");
		a.add("hi");
		a.add(20.5);
		a.add(3);
		a.add(false);
		System.out.println(a);
		System.out.println(a.size());
		System.out.println(a.contains("hi"));
		System.out.println(a.indexOf(false));
		a.remove("hi");
		System.out.println(a);
		a.addFirst("one");
		a.addLast("last");
		System.out.println(a);
		a.removeFirst();
		a.removeLast();
		System.out.println(a);
	    for(Object obj:a)
	    {
	    	System.out.println(obj);
	    }
	}
}