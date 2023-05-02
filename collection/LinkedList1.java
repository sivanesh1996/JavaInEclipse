package collection;

import java.util.LinkedList;

public class LinkedList1 {

	public static void main(String[] args) {
		LinkedList lk=new LinkedList();
		
		lk.add(1);
		lk.add(9);
		lk.add("hello");
		
		lk.addFirst(0);
		lk.addLast("Bye");
		
		System.out.println("1:"+lk);
		System.out.println("2:"+lk.contains(9));
		System.out.println("3:"+lk.element());
		System.out.println("4:"+lk.get(0));
		System.out.println("5:"+lk.getFirst());
		System.out.println("6:"+lk.getLast());
		System.out.println("7:"+lk.offer("tail"));
		System.out.println("8:"+lk.offerFirst("Engine"));
		System.out.println("9:"+lk.offerLast("X"));
		System.out.println("10:"+lk);
		
		LinkedList lk1=new LinkedList(lk);
		
		
		System.out.println("11:"+lk.peek());
		System.out.println("12:"+lk.peekFirst());
		System.out.println("13:"+lk.peekLast());
		
		System.out.println("14:"+lk.poll());
		System.out.println("15:"+lk.pollFirst());
		System.out.println("16:"+lk.pollLast());
		
		System.out.println("17:"+lk);
		
		lk.clear();
		
		System.out.println("18:"+lk1);
		
		System.out.println("19:"+lk1.pop());
		//System.out.println("20:"+lk.push("HORN !!!"));
		//System.out.println("20:"+lk1.remove()); //deletes 0
		//System.out.println("21:"+lk1.removeFirst());//deletes 0
		System.out.println("22:"+lk1.removeLast());//delete X
		lk1.add(0);
		System.out.println("23:"+lk1);
		System.out.println("24:"+lk1.removeLastOccurrence(0));
		System.out.println("25:"+lk1);
		System.out.println("26:"+lk1.set(4,"Byeee"));
		System.out.println("27:"+lk1);
		
		Object[] o=lk1.toArray();
	    for(Object oi:o) {
	    	System.out.print(oi+" ");
	    	
	    }
		
	
	}

}
