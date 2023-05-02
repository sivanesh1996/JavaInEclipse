package oneDArray;

public class RotateArray {

	public static void main(String[] args) {
		// left rotate
		char ch[]= {'A','B','C','D','E'};
		
		int noOfTimes=2;
		for(int i=0;i<noOfTimes;i++) {
			char first=ch[0];
			int j=0;
			while(j<ch.length-1) {
				ch[j]=ch[j+1];
				j++;
			}
			ch[j]=first;
			
		}
		
		for(int i=0;i<ch.length;i++) {
			System.out.print(ch[i] +" ");
		}
		
	}

}
