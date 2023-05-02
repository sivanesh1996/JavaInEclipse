package stringBuffer;

import java.awt.desktop.SystemSleepEvent;

public class Practice1 {

	public static void main(String[] args) {
		StringBuffer s=new StringBuffer("Hi");
		System.out.println(s);

		s.append('A'); //char
		System.out.println(s); 
		s.append(false); //boolean
		System.out.println(s);
		s.deleteCharAt(2);
		System.out.println(s);

		String s2="siva";
		StringBuffer s1=new StringBuffer(s2);
		System.out.println(s1);
		s1.reverse();
		System.out.println(s1);
		s1.replace(0, 3,"kal");
		System.out.println(s1);
		
		
		
	}

}
