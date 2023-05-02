package prep;

public class RightShift {

	public static void main(String[] args) {
		char ch[]= {'A','B','C','D','E'};
		// E-A,B,C,D
		
		int no=1;
		for(int i=0;i<no;i++) {
			char temp=ch[4];
			int j=4;
			while(j>0) {
				ch[j]=ch[j-1];
				j--;
			}
			ch[j]=temp;
		}
		
		for(char o:ch) {
			System.out.print(o +" ");
		}

	}

}
