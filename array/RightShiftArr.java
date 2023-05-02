package array;

public class RightShiftArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch[]= {'J','K','L','M','N'};
		//EXPECTED O/P- N,J,K,L,M
		//ch[1]=J ch[2]=K ch[3]=L ch[4]=M ch[0]=N
		for(int no=0;no<2;no++) {
		char temp=ch[ch.length-1];
		int i=ch.length-1;
		for(;i>0;i--) {
			ch[i]=ch[i-1];
		}
		ch[i]=temp;
		}
		
		for(char o:ch) {
			System.out.print(o +" ");
		}
		
		

	}

}
