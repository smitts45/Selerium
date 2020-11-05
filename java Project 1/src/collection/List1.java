package collection;//Collections

import java.util.ArrayList;

public class List1 
{

	public static void main(String[] args)
	{
		ArrayList<Object> a= new ArrayList<Object>();
		//You can give many types like Integer,String
		a.add(10);
		a.add("Smitts");
		a.add(22.45f);
		a.add('a');
		a.add(100);
		a.add(20);
		
		a.add(40);
		
		
		System.out.println(a);
		System.out.println(a.get(1));
		System.out.println(a.indexOf(20));
		System.out.println(a.isEmpty());
		
		System.out.println(a.size());
		
		a.add(1, "s");
		System.out.println(a);
		
		a.set(1, "SS");
		System.out.println(a);
		
		System.out.println(a.subList(2, 6));
		a.remove(1);
		System.out.println(a);
		
	}

}
