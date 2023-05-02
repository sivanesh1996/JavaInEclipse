package collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeSet;

public class MapDemo {

	
	public static void main(String[] args) {
		HashMap m=new HashMap();
		m.put("dosai",10);
		m.put("kal dosai",12);
		m.put("rava dosai",15);
		m.put("tea",10);
		m.put("coffee",12);
		m.put("nice dosai",20);
		//System.out.println(m);
		
	
		ArrayList lm=new ArrayList(m.keySet());
		System.out.println("Before filtering:"+lm);
		Object[] o=lm.toArray();
		
		for(Object o1:o) {
			
			if(!o1.toString().contains("dosai")) {
				lm.remove(o1);
			}
			
		}
		
		System.out.println("After filtering:"+lm);
		
	

	}

}
