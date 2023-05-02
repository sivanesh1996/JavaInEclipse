package string;

public class Method1 {

	public static void main(String[] args) {
		String s="siva is a";
		String s1="hi sivanesh";
		String s2="Alan is Alan";
		System.out.println(s.codePointAt(0)); //Returns the index value of H
		System.out.println(s.codePointBefore(1)); //Return the index value before given value
		
		System.out.println(s.concat(s1)); //join 2 string
		System.out.println(s1.contains(s)); //given full para->s1  to be search->s
		System.out.println(s.contains("hi"));
		System.out.println(s.charAt(0)); //returns the char value at specified index
		System.out.println(s.codePointCount(1, 6));
		System.out.println(s1.indexOf('s'));
		System.out.println(s1.lastIndexOf('s'));
		System.out.println(s.endsWith("va"));
		System.out.println(s.startsWith("si"));
		System.out.println(s2.indexOf("Alan"));
		System.out.println(s2.indexOf("Alan", 4));
		
		String s3="B a l a";
		s3=s3.replaceAll(" ","");
		System.out.println(s3);
	}

}
