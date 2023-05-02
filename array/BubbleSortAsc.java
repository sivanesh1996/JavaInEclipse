package array;

public class BubbleSortAsc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,20,50,80,5,90};
		
		for(int i=0;i<arr.length;i++) {
				int temp=arr[i];
			for(int j=i+1;j<arr.length;j++) {
				if(temp>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		for(int o:arr) {
			System.out.print(o +" ");
		}
	}


}
