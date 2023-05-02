package basic;

public class PrintPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=1;
		
		while(num<=13) {
			int i=1;
			int count=0;
		
		while(num>=i) {
		if(num%i==0) {
			count++;
		}
		i++;
	}
		if(count==2) {
			System.out.println(num);
		}
		num++;
		}
	}
}
