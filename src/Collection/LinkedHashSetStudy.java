package Collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetStudy {

	public static void main(String[] args) {
		
LinkedHashSet lh= new LinkedHashSet();
		
		lh.add(100);
		lh.add("velocity");
		lh.add('A');
		lh.add(null);
		lh.add(100);
		lh.add(null);
		lh.add('B');
		
		System.out.println(lh);
		System.out.println(lh.isEmpty());
		System.out.println(lh.size());
		System.out.println(lh.contains('B'));
		
		System.out.println(lh);
		
		lh.remove(100);
		System.out.println(lh);
		
		
		System.out.println("===================Using Iterator=================");
		
		Iterator it= lh.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println("===================Using For each loop=================");
		
		for(Object o:lh)
		{
			System.out.println(o);
		}
				
		lh.clear();
		System.out.println(lh);
		
		System.out.println(lh.size());
		
		System.out.println(lh.isEmpty());
	}


}
