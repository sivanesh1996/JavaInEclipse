package practice;

public class Binary {

	public static void main(String[] args) {
		int num=101120;
		boolean check=true;
		int value=0;
		while(num>0) {
			value=num%10;
			num/=10;
			if(value>1) {
				System.out.println("not binary");
				break;
			}
		}

		if(value==0 || value==1)
			System.out.println("binary");
			
		
	}

}
