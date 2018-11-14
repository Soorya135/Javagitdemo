package weqr;

import java.util.Collections;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class setexamples {
	
	public static void main(String args[])
	{
		Set<Integer> Haset = new HashSet<Integer>();
		Haset.add(1);
		Haset.add(2);
		Haset.add(3);
		Haset.add(4);
		Haset.add(5);
		
		for (Integer abc : Haset)
		{
			System.out.println("The value of the variable is " + abc);
		}
		
		if(Haset.contains(8))
		{
			System.out.println("Value 5 is present in the Set");
		}
		else
		{
			System.out.println("Value 5 is not present in the Set");
		}
		
		Set<Integer> TreeHaset = new TreeSet<Integer>();
		TreeHaset.add(1);
		TreeHaset.add(2);
		TreeHaset.add(3);
		TreeHaset.add(4);
		TreeHaset.add(5);
		
		for (Integer abc : TreeHaset)
		{
			System.out.println("The value of the variable is " + abc);
		}
		
		//Example of Linked Hash set
		
		Set<String> Lhs = new LinkedHashSet<String>();
		Lhs.add("9");
		Lhs.add("6");
		Lhs.add("7");
		
		Enumeration<String> ens = Collections.enumeration(Lhs);
		while(ens.hasMoreElements())
		{
			System.out.println("The value fo the linked hash set are " + ens.nextElement());
		}
		
		
	}

}
