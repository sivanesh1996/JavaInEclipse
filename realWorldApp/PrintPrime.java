package realWorldApp;

public class PrintPrime {

	public static void main(String[] args) {
		int max=23;
		int no=1;
		while(no<=max) { // 1<=3
			
			int i=1;
			int count=0;
		while(no>=i) // 1>=1 
		{
		if(no%i==0) {
			count++;
		}
			i++;
		}
		if(count==2) { // 1
			System.out.println(no);
		}
		no++;
		}

	}

}
