package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.AbstractList;

public class Arraylist1 {

	public static void main(String[] args) {
		
		ArrayList li=new ArrayList();
		ArrayList li1=new ArrayList();
	   System.out.println("1: "+li.add("hi"));
	   li.add("helo");
	   li.add(1,"hello");
	   System.out.println("2:"+li);
	   li.add("hello");
	   
	   //li.clear();
	Object o=new Object();
	  o=li.clone();
	System.out.println("3:"+o);
	
	
	System.out.println("4:"+li.contains("hi"));
	
	System.out.println("5:"+li.get(0));
	  
	System.out.println("6:"+li.indexOf("hello"));
	System.out.println("7:"+li);
	li.ensureCapacity(9);
	System.out.println("8:"+li.size());
	System.out.println("9:"+li.isEmpty());
	
	System.out.println("10:"+li.lastIndexOf("hello"));
	   
//	o=li.remove(0);
//	System.out.println(o);

	System.out.println("11:"+o);
	li.remove("hello");
	System.out.println("12:"+li);
	
	//li.removeRange(0,1);

	li.set(0,"hii");
	System.out.println("13:"+li);
	
	System.out.println("14:"+li.size());
	
	//li2=li.subList(0,2);
	
	Object[] o1=new Object[li.size()];
	o1=li.toArray();
	for(Object i:o1) {
		System.out.print("15:"+i);
	}
	System.out.println();
	
    li1.add(1);
    li1.add(2);
    li1.add(3);
    li1.add(4);
    System.out.println("16:"+li1);
    li1.addAll(li);
    System.out.println("17:"+li1);
    li1.retainAll(li);
    System.out.println("18:"+li1);
    
    li1.add(1);
    li1.add(2);
    li1.add(3);
    li1.add(4);
    
    System.out.println("19:"+li1);
    //li1.remove(3);
   System.out.println("20:"+li1.remove(2));
    System.out.println("21:"+li1);
	}

}
