package weqr;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class OneTreemap {
	
	public static void main(String args[])
	{
		Map<String,Integer> TM = new TreeMap<>();
		Map<String,Integer> LHM = new LinkedHashMap<>();
	    TM.put("a", 1);
	    TM.put("b", 1);
	    TM.put("c", 1);
	    TM.put("d", 1);
	    TM.put("e", 1);
	    
	    Set keys = TM.keySet();
	    Iterator it1 = keys.iterator();
	    while(it1.hasNext())
	    {
  	
  	
	    	System.out.println("The key is " + TM.get(it1.next()));
	    }
		
	    //Implementatio2 
	    
	    Set Keys = TM.entrySet();
	    Iterator one =Keys.iterator();
	    while(one.hasNext()) {
	    	Map.Entry abc = (Map.Entry)one.next();
	    	System.out.print("The key is" + abc.getKey() + "And the value is" + abc.getValue());
	    }
	    
	    
	}

}
