package classRoomPractice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;


public class CursorDemo {

	public static void main(String[] args) {
		
		ArrayList name=new ArrayList();
		name.add("siva");
		name.add("M");
		name.add(26);
		name.add("Nagercoil");
		name.add("Kanyakumari district");
		
//		for(Object s:name) {
//			System.out.println(s);
//		}
		
	//	Iterator it=name.iterator();
//		while(it.hasNext())
//		{
//			System.out.println(it.next());
//		}
		System.out.println("Before:"+name);
		
//	while(it.hasNext()) {
//		if(it.next().equals("M")){
//			it.remove();
//		}
//	}
//	
//	System.out.println("After:"+name);
		
		ListIterator li=name.listIterator();
		li.add("Kumar");
		
		while(li.hasNext())
		{
			if(li.next().equals("siva"))
				li.set("sivanesh");
		}
		
		System.out.println("After:"+name);
		
		
	}
		
		

	

}
