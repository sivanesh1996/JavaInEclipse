package prep;

public class Lcm3no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int no1=6;
		int no2=24;
		int no3=21;
		int lcm=0;
		
		int max=(no1>no2?no1:no2)>no3?(no1>no2?no1:no2):no3;
		//System.out.println(max);
		
		while(true) {
		if(max%no1==0 && max%no2==0 && max%no3==0) {
			lcm=max;
			break;
		}
		max++;
		}
		System.out.println("lcm of "+no1 +"," +no2 +"," +no3 +" is:"+lcm);
	}

}
