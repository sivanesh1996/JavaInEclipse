package collection;

import java.util.Comparator;
import java.util.HashSet;
import java.util.TreeSet;

public class Mobile {

	public static void main(String[] args) {
		
		HashSet ts=new HashSet();
		ts.add(new MobileModel("Samsung","S2"));
		ts.add(new MobileModel("Samsung","S3"));
		ts.add(new MobileModel("Samsung","S3 pro"));
		ts.add(new MobileModel("Sony","Z2"));
		
		TreeSet s=new TreeSet(ts);
		s=new TreeSet(new mobileComparator());
		
	
	}

	
	}


