package practice;

public class AlternateZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=12345;
		String s=Integer.toString(x);
		int length=s.length()*2;
		char arr[]=new char[length];
		//System.out.println(length);
		int j=0;
		for(int i=0;i<length;i++) {
			
			if(i%2==0) {
				arr[i]=s.charAt(j);
				j++;
			}
			else {
				arr[i]='0';
			}
			
		}
		
		String s1=new String(arr);
		int k=Integer.parseInt(s1);
		System.out.println(k);
		
//		for(char o:arr) {
//			System.out.print(o +" ");
//		}

	}

}
