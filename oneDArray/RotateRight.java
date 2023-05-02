package oneDArray;

public class RotateRight {

	public static void main(String[] args) {
		char c[]= {'A','B','C','D','E'};
		int noOfTimes=2;
		for(int j=0;j<noOfTimes;j++) {
           char temp=c[c.length-1];
		for(int i=c.length-1;i>0;i--) {
			c[i]=c[i-1];
		}
		c[0]=temp;
		
		
	}
		
		for(int i=0;i<c.length;i++) {
			System.out.print(c[i] +" ");
		}
	}

}
