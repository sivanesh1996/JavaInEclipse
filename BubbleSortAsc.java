
public class BubbleSortAsc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[]= {7,5,1,4,6,3,8,16};
		
		for(int i=0;i<ar.length;i++) {
			for(int j=i+1;j<ar.length;j++) {
				if(ar[i]<ar[j]) {
				int temp=ar[i];
				ar[i]=ar[j];
				ar[j]=temp;
				}
			}
			
		}
		
		System.out.println("bubble sort:");
		for(int o:ar) {
			System.out.print(o +" ");
		}
	}

}
