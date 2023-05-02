package prep;

public class CheckBinary {

	public static void main(String[] args) {
		int n=101120;
		int value=0;
		boolean flag=true;
		
		while(n>0) {
			value=n%10;
			n=n/10;
			if(value>1) {
				flag=false;
				System.out.println("not binary");
				break;
			}
		}
		if(flag)
			System.out.println("binary");

	}

}
