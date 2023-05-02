package collection;

import java.util.HashSet;

public class HashSet1 {

	public static void main(String[] args) {
		
		HashSet hs=new HashSet();
		hs.add(1);
		hs.add(1);
		hs.add(2);
		hs.add(2);
		hs.add(1);
		hs.add(2);
		System.out.println(hs);
		
		Tv obj=new Tv("LG-32 inch",20000);
		Tv obj1=new Tv("LG-32 inch",20000);
		
		hs.add(obj);
		hs.add(obj1);
		System.out.println(hs.size());
	}

}
