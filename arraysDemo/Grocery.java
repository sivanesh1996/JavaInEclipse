package arraysDemo;

import java.util.Arrays;
import java.util.Comparator;

public class Grocery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String list[]= {"Apple","Beans","Carrot","Deepam","Elon","Amla","Mushroom"};
//		Arrays.sort(list);
//		System.out.println(" sorting:");
//		for(String i:list) {
//			System.out.println(i);
//		}
		Comparator cp=new ComparatorDemo();
		Arrays.sort(list,cp);
//		
//		System.out.println("Sort descending using compareTo");
//		for(String i:list) {
//			System.out.println(i);
//		}
		
		System.out.println("Sort by length descending");
		for(String i:list) {
			System.out.println(i);
		}
	}

}
