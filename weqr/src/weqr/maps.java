package weqr;

import java.awt.event.MouseAdapter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class maps {
	
	public static void main(String args[])
	{
		Map<String,Integer> emp = new HashMap<>();
		emp.put("soorya", 1);
		emp.put("test", 1);
		emp.put("bcc", 1);
		emp.put("ddd", 1);
		emp.put("eee", 1);
		
		System.out.print("The value of the Map is" + emp);
		
	    Set<String> keys = emp.keySet();
	    
	    
		for(String abcd : keys)
		{
			System.out.println("The value of the hashmap is" + emp.get(abcd));
		}
	    
	    
		//Accesssing using entry set
		
		Set et = emp.entrySet();
		Iterator it1 = et.iterator();
		while(it1.hasNext())
			
		
		{
			 Map.Entry mentry = (Map.Entry)it1.next();
	         System.out.print("key is: "+ mentry.getKey() + " & Value is: ");
	         System.out.println(mentry.getValue());
		}
		
		
		Set c1 = emp.entrySet();
		Iterator loop = c1.iterator();
		//Map.Entry falltry = (Map.Entry)c1.iterator();
		while(loop.hasNext())
		{
			Map.Entry falltry = (Map.Entry)c1.iterator();
			System.out.println("The key is" + falltry.getKey());
			System.out.println("The value is" + falltry.getValue());
		}
		
	}

	

}

