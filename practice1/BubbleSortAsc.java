package practice1;

public class BubbleSortAsc {

	public static void main(String[] args) {
		
		int ar[]= {5,7,9,1,2,6};
		
		for(int i=0;i<ar.length;i++) {
			for(int j=i+1;j<ar.length;j++)
			{
				
				if(ar[j]<ar[i]) {
					int temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
				
			}
		}
		
		for(int o:ar) {
			System.out.print(o +" ");
		}

	}

}
