package oneDArray;

import java.util.Scanner;

public class Delete {

	public static void main(String[] args) {
		int arr[]= {1,2,3,3,4,5};
		int arr1[]=new int[arr.length-1];
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the position of element to delete:");
		int d=sc.nextInt();
		for(int i=0;i<d-1;i++) //d=4;
		{
			arr1[i]=arr[i];
		}

		for(int i=d-1;i<arr1.length;i++) {
			arr1[i]=arr[i+1];
		}
		System.out.println();
		
		for(int i=0;i<arr1.length;i++) {
			System.out.print(arr1[i] +" ");
		}
	}

}
