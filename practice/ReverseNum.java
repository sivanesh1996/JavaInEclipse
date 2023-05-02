package practice;

public class ReverseNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int no=12345;
		int reverse=0;
		int mod=0;
		
		while(no>0) {
			mod=no%10;
			reverse=reverse*10+mod;
			no=no/10;
			
			
		}
		no=reverse;
		System.out.println("After reversing:"+no);

	}

}
