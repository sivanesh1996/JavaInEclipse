package practice;

public class PalindromeStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String given="Amma";
		String s=given;
		s=s.toLowerCase();
		String reverse="";
		

		for(int i=s.length()-1;i>=0;i--) {
			reverse=reverse+s.charAt(i);
		}
		
	
		
		if(s.equals(reverse))
			System.out.println(given +" is palindrome");
		else
			System.out.println(given +" is not a palindrome");

	}

}
