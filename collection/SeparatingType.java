package collection;

import java.util.ArrayList;

public class SeparatingType {

	public static void main(String[] args) {
		
		ArrayList l1=new ArrayList();
		l1.add(1);
		l1.add("siva");
		l1.add("joe");
		l1.add(5);
		l1.add("Deepan");
		l1.add(4);
		l1.add(3);
		l1.add(null);
		System.out.println(l1);
		ArrayList l2=new ArrayList();
		ArrayList l3=new ArrayList();
		System.out.println("String:");
		for(int i=0;i<l1.size();i++) {
			try {
			if(l1.get(i).getClass().equals(String.class)) {
			//l2.add(l1.get(i));
				System.out.print(l1.get(i) +" ");
			}
			}
			catch(NullPointerException e) {
				System.out.println("null");
			}
			
		}
		System.out.println("Integer:");
		
		for(int i=0;i<l1.size();i++) {
			try {
			if(l1.get(i).getClass().equals(Integer.class)) {
				//l2.add(l1.get(i));
				System.out.print(l1.get(i) +" ");
			}
			}
			catch(NullPointerException e) {
				System.out.println(" ");
			}
        //System.out.println(l2);
	}
		
		for(int i=0;i<l1.size();i++) {
		if(l1.get(i)==null)
		{
			//l1.remove(i);
		}
		else {
			l2.add(l1.get(i));
		}
		}
		System.out.println("l2:"+l2);
		
		

		for(int i=0;i<l1.size();i++) {
		if(l1.get(i)==null)
		{
			l1.remove(i);
			l3.add("Choclate");
		}
		else {
			l3.add(l1.get(i));
		}
		}
		System.out.println("l3:"+l3);
		
		

}
}
