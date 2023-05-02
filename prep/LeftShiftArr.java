package prep;

public class LeftShiftArr {

	public static void main(String[] args) {
		char ch[]= {'a','b','c','d','e'};
		//b,c,d,e,a
		
		int no=1;
		for(int i=0;i<no;i++) {
			char temp=ch[0];
			int j=0;
			while(j<ch.length-1) {
				ch[j]=ch[j+1];
				j++;
			}
			ch[j]=temp;
		}
		
		for(char o:ch) {
			System.out.print(o +" ");
		}

	}

}
