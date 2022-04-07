package Collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetStudy {

	public static void main(String[] args) {
		
	HashSet h=new HashSet();
		
	h.add(100);
	h.add("Velocity");
	h.add('A');
	h.add(100);// added duplicate
	h.add(66.7f);
    h.add(null);
    h.add(null);
		

	System.out.println(h);
	System.out.println(h.size());
	System.out.println(h.contains('A'));
	System.out.println(h.isEmpty());
	System.out.println(h);
	System.out.println(h.remove('A'));
	System.out.println(h);
	
	System.out.println("===================Using Iterator=================");
	
	Iterator it= h.iterator();
	
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
	
	System.out.println("===================Using For each loop=================");
	
	for(Object o:h)
	{
		System.out.println(o);
	}

	h.clear();
	System.out.println(h);
	
	System.out.println(h.isEmpty());
	
		
	}
}
