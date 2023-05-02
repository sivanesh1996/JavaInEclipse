package basic;

public class CheckBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no=120101;
		int sum=0;
		
		while(no>0) {
			sum=no%10;
			no/=10;
		
		if(sum>1) {
			System.out.println("Number not binary");
			break;
		}
		}
		if(sum<2) {
			System.out.println("Number is binary");
		}

	}

}
