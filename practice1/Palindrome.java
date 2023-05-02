package practice1;

public class Palindrome {
	

	static void str(String s) {
		char ch[]=s.toCharArray();
		String s1="";
		
		for(int i=s.length()-1;i>=0;i--) {
			s1=s1+ch[i];
		}
		
		if(s.equals(s1))
			System.out.println("Palindrom");
		else
			System.out.println("not palindrome");
		
	}
	
	static void num(int n) {
		int copy=n;
		int val=0;
		while(n>0) {
			val=(val*10)+(n%10);
			n=n/10;
		}
		
		if(val==copy) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("not palindrome");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Palindrome.str("idil");
		Palindrome.num(1211);

	}

}
