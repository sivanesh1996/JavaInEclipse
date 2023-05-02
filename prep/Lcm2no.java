package prep;

public class Lcm2no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int no1=3;
		int no2=28;
		int lcm=0;
		//x/3 x/9-->here max no because multiplier of 9 is 9,18,27...
		// 3 --> 3,6,9,12,15
		int max=no1>no2?no1:no2;
		System.out.println(max);
		
		while(true) {
		if(max%no1==0 && max%no2==0) {
			lcm=max;
			break;
		}
		max++;
		}
		System.out.println("lcm of "+no1 +"," +no2 +" is:"+lcm);

	}

}
