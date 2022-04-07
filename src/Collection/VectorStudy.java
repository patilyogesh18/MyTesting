package Collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class VectorStudy {
	
	public static void main(String[] args) {
		
		Vector v=new Vector();
		
		v.add(100);
		v.add("Velocity");
		v.add(88.2f);
		v.add(100);
		v.add(null);
		v.add(null);
		
		System.out.println(v);
		System.out.println(v.capacity());
		System.out.println(v.size());
		System.out.println(v.isEmpty());
		System.out.println(v.contains(2));
		System.out.println(v.indexOf("Velocity"));
		System.out.println(v.get(5));
		System.out.println(v);
		
		v.add(1,"Pune");
		System.out.println(v);
		
		v.remove(3);
		System.out.println(v);
		System.out.println("===================For each loop=================");
		for(Object o:v)
		{
			System.out.println(o);
		}
		 
		System.out.println("===================Using Iterator=================");
		
		Iterator i=v.iterator();
		while(i.hasNext())	
		{
			System.out.println(i.next());
		}
		
//		System.out.println("===================Using ListIterator=================");
//		
//		// ListIterator-->> Applicable for all classes implements list interface
//		
//		ListIterator li=v.listIterator();
//		while(li.hasNext());
//		{
//			System.out.println(li.hasNext());
//		}
//		
		System.out.println("===================Using Enumeration=================");
		
		Enumeration en=v.elements();
		while (en.hasMoreElements()) 
		{
		System.out.println(en.nextElement());	
		}
		
	}

}
