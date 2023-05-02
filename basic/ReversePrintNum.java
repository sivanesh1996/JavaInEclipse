package basic;

public class ReversePrintNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=1234556;
		int val=0;
		
	
		while(num>0) {
			val=val*10+num%10;
			num=num/10;
		}
		
		System.out.println(val);

	}

}
