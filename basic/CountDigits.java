package basic;

public class CountDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=123456789;
		int count=0;
		while(num>0) {
			num=num/10;
			count++;
			// 123 /10 == 12
			// 12/10 == 1
			// 1/10==0
			
		}
		System.out.println("Count of digits:"+count);

	}

}
