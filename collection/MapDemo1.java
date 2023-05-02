package collection;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeMap;

public class MapDemo1 {

	public static void main(String[] args) {
		
		TreeMap<Integer,String> tr=new TreeMap<Integer,String>();
		tr.put(70,"meals");
		tr.put(90,"chicken briyani");
		tr.put(70,"veg briyani");
		tr.put(40,"lemon rice");
		tr.put(40,"curd rice");
	
		Set ls=new LinkedHashSet();
		ls=tr.entrySet();
		System.out.println(ls);
		
			
		
		

	}

}
