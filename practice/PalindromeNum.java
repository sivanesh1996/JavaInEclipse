package practice;

public class PalindromeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int given=123;
		int x=given;
		int sum=0;
		
		while(x>0) {
			sum=(sum*10)+x%10;
			x=x/10;
			
		}
		
		System.out.println(sum);
		
		if(given==x)
			System.out.println(given +" number is palindrome");
		else
			System.out.println(given +" number is not a palindrome");
	}

}
