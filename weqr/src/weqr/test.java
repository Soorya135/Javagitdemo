package weqr;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;

public class test {
	
	public static void main(String args[])
	{
		Vector<String> vec1 = new Vector<String>(10);
		vec1.add("10");
		vec1.add("20");
		vec1.add("30");
		
		LinkedList<String> l1 = new LinkedList<>();
		l1.add(0, "one");
		l1.add(1, "three");
		l1.add(2, "two");
		
		ArrayList<String> ar1 = new ArrayList<String>();
		ar1.add("abd");
		ar1.add("bcc");
		ar1.add("ccc");
		
		
		Enumeration<String> arraylist = Collections.enumeration(ar1);
		while(arraylist.hasMoreElements())
		{
			System.out.println("The value of the elements is " + arraylist.nextElement());
		}
		
		
		Enumeration e = vec1.elements();
		
		while(e.hasMoreElements())
		{
			System.out.println("The value of the enumeration is" + e.nextElement());
		}
		
		Iterator<String> test1 = vec1.iterator();
		while(test1.hasNext())
		{
			if(test1.next() == "30")
			{
				test1.remove();
			}
			//System.out.println("The  value using iterator is " + test1.next());
			
		}
		
		//test1.remove();
		System.out.println("The value of the vec1 is" + vec1);
		
		test1 = vec1.iterator();
		
		while(test1.hasNext())
		{
			System.out.println("The  value using iterator is " + test1.next());
		}
		
		//Traversing through linked list
		
		Enumeration<String> em = Collections.enumeration(l1);
		
		while(em.hasMoreElements())
		{
			System.out.println("The value using the enumeration is" + em.nextElement());
		}
		
		Enumeration<String> em1 = Collections.enumeration(l1);
		while(em1.hasMoreElements())
		{
			System.out.println("The value of the element is" + em1.nextElement());
		}
		
		Iterator it1 = l1.iterator();
		while(it1.hasNext())
		{
			System.out.println("The value of the linked list items are " + it1.next());
		}
		
		
		
	}

}
