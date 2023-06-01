package prep;

public class Gcd2no {

	public static void main(String[] args) {
		int no1=3;
		int no2=7;
		int gcd=0;
		int min=no1<no2?no1:no2;
		//System.out.println(min);
		
		//  3/x 9/x
		// 3 --> 3,1
		// 9 --> 9,3,1
		while(true) {
		if(no1%min==0 && no2%min==0) {
			gcd=min;
			break;
		}
		min--;
		
		}
		
		System.out.println("GCD of " +no1 +"," +no2 +" is:" +gcd);
		
		

	}

}
