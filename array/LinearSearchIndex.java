package array;

public class LinearSearchIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {10,20,50,70,1,5};
		int key=21;
		boolean flag=true;
		int i=0;
		
		while(i<arr.length) {
			if(arr[i]==key) {
				flag=false;
				System.out.println(key +" present in " +i +" th position");
				
			}
			i++;
		}
		if(flag==true)
			System.out.println(key +" not found");
	}
	

}
