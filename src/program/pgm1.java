package program;

import java.util.ArrayList;

import java.util.Collections;

public class pgm1 {

	public static void main(String[] args) {
		ArrayList<Integer> a=new ArrayList<Integer>();
		a.add(50);
		a.add(90);
		a.add(20);
		a.add(35);
		Collections.sort(a);
	    
		
		ArrayList<Object> b=new ArrayList<Object>();
		b.add("helo");
		b.add("hi");
		b.add(20.5);
		b.add(3);
		b.add(false);
		System.out.println(a);
		System.out.println(a.size());
		System.out.println(b.contains("hi"));
		System.out.println(b.indexOf(false));
		
		System.out.println(b);
	}
}
