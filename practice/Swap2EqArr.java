package practice;

public class Swap2EqArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,5};
		int b[]= {3,6,7};
		int i=0;
		while(i<a.length) {
			int temp=a[i];
			a[i]=b[i];
			b[i]=temp;
			i++;
		}
		System.out.println("array a:");
		for(int o:a) {
			System.out.print(o +" ");
		}
		System.out.println("array b:");
		for(int o:b) {
			System.out.print(o +" ");
		}

	}

}
