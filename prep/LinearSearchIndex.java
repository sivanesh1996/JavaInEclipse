package prep;

public class LinearSearchIndex {

	public static void main(String[] args) {
		int arr[]= {10,20,30,40};
		int key=21;
		int i=0;
		while(i<arr.length) {
			if(arr[i]==key) {
				System.out.println("Present in "+i+" th position");
				break;
			}
			i++;
			
			if(i==arr.length) {
				System.out.println("Not present");
			}
		}

	}

}
