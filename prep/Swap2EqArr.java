package prep;

public class Swap2EqArr {

	public static void main(String[] args) {
		int a[]= {1,2,3};
		int b[]= {4,5,6};
		
		for(int i=0;i<a.length;i++) {
			int temp=a[i];
			a[i]=b[i];
			b[i]=temp;
		}
		System.out.print("a[]-->");
		for(int o:a) {
			System.out.print(o +" ");
		}
		System.out.print("b[]-->");
		for(int o1:b) {
			System.out.print(o1 +" ");
		}

	}

}
