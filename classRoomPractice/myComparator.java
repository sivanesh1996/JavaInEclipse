package classRoomPractice;

import java.util.Comparator;

public class myComparator implements Comparator {

	public int compare(Object o1, Object o2)
	{
		Student s1 = (Student)o1;
		Student s2 = (Student)o2;
		if(s1.getAge()>s2.getAge())
			return 84848;
		else if(s1.getAge()<s2.getAge()) {
			return -899;
		}
		else
			return 0;
		
	}
}


