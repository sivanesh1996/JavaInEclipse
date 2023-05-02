package prep;

public class PalindromaNum {

	public static void main(String[] args) {
		int no1=2002;
		int no2=no1;
		int rem=0;
		
		while (no1>0) {
			rem=(rem*10)+no1%10;
			no1=no1/10;
		}
		System.out.println(rem);
		
		if(rem==no2) 
			System.out.println(no2 +" is Palindrome");
		else
			System.out.println(no2 +" is not a Palindrome");

	}

}
