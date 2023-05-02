package string;

public class CompareString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="ABC";
		String s1="ABCD";
		System.out.println(s.compareTo(s1));
		
		s="ABCD";
		s1="ABCD";
		System.out.println(s.compareTo(s1));
		
		s="BC";
		s1="AB";
		System.out.println(s.compareTo(s1));
		
		s="ABC";
		s1="abc";
		System.out.println(s.compareTo(s1)); //65-97
		System.out.println(s.compareToIgnoreCase(s1)); //65-65
		
		s="ABC";
		s1="acbp";
		System.out.println(s.compareTo(s1)); //65-97
		System.out.println(s.compareToIgnoreCase(s1)); //65-65
		
	}

}
