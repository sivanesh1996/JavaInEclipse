package practice;

public class ConvertArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String arr[]= {"1","5","1","2","3","3","5","4","6","5","6"};
		int ar[]=new int[arr.length];
		
		for(int i=0;i<arr.length;i++) {
			ar[i]=Integer.parseInt(arr[i]);
		}
		
		for(int j:ar) {
			System.out.println(j);
		}
	}

}
