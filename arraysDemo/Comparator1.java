package arraysDemo;

import java.util.Comparator;

public class Comparator1 implements Comparator {

	@Override
	public int compare(Object arg0, Object arg1) {
		
		Mobile m1=(Mobile)arg0;
		Mobile m2=(Mobile)arg1;
		
		if(m1.price>m2.price)
			return +1;
		else if(m1.price<m2.price)
			return -1;
		else
			return 0;
	}

}
