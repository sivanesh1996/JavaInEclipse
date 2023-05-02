package prep;

public class Fibonacci1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int first=0;
		int second=1;
		int i=0;
		
		while(i<=7)
		{
			System.out.print(first +" ");
			int total=first+second;
			first=second;
			second=total;
			i++;
			
		}
		

	}

}
