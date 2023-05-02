package classRoomPractice;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List l= new ArrayList();
		l.add("man");
		l.add("tom");
		Set provision = new TreeSet(new myComparator());
         provision.add(new Student("praveen",18,78));
		 provision.add(new Student("naveen",15,78));
		 provision.add(new Student("kavin",19,98));
		// provision.addAll(l);
        System.out.println(provision);
        
	}

}
