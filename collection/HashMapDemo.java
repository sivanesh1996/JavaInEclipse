package collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		
		HashMap hm=new HashMap();
		hm.put("dosai",10);
		hm.put("kal dosai",12);
		hm.put("rava dosai",15);
		hm.put("tea",10);
		hm.put("coffee",12);
		hm.put("nice dosai",20);
		//hm.put("dosai", 20);
		
	//	System.out.println(hm);
		
		//System.out.println(hm.values());
	
		Collection c=hm.keySet();
		Set s=hm.entrySet();
		
	Iterator i=	s.iterator();
	while(i.hasNext()) {
		
		 Map.Entry me= (Map.Entry)i.next();
		 if(me.getKey().equals("nice dosai"))
			 me.setValue(22);
		 System.out.println(me);
	
	}
	 System.out.print(hm);
	}

}
