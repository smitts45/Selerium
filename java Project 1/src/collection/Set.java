package collection;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Set {

	public static void main(String[] args) 
	{
		HashSet<Integer> d= new HashSet<Integer>();
	d.add(100);
	d.add(200);
	d.add(300);
	d.add(200);	//no duplicates allowed
	d.add(400);	//no order 
	
	System.out.println(d);
	
	
	LinkedHashSet<Integer> g= new LinkedHashSet<Integer>();
	g.add(100);
	g.add(200);
	g.add(300);
	g.add(200);	//duplicates allowed
	g.add(400);	// order preserved
	
	System.out.println(g);
	
	
	}

}
