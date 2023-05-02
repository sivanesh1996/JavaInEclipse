package prep;

public class Gcd3no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int no1=8;
		int no2=64;
		int no3=48;
		int gcd=0;
		int min=(no1<no2?no1:no2)<no3?(no1<no2?no1:no2):no3;
		//System.out.println(min);
		while(true) {
		if(no1%min==0 && no2%min==0 && no3%min==0) {
			gcd=min;
			break;
		}
		min--;
		}
		
		System.out.println("GCD of " +no1 +"," +no2 +"," +no3 +" is:" +gcd);

	}

}
