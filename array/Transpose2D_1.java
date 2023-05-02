package array;

import java.util.Scanner;

public class Transpose2D_1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows and columns");
		int r=sc.nextInt();
		int c=sc.nextInt();
		int arr[][]=new int[r][c];
		int res[][]=new int[c][r];
		System.out.println("Enter the values one by one");
	//	System.out.println(arr[0].length);
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Given matrix A:");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j] +" ");
			}
			System.out.println();
		}
		
		System.out.println("Transpose matrix is:");
		System.out.println(res.length);
		for(int i=0;i<res.length;i++) {
			for(int j=0;j<res[i].length;j++) {
				res[i][j]=arr[j][i];
			}
		}
		
		for(int i=0;i<res.length;i++) {
			for(int j=0;j<res[i].length;j++) {
				System.out.print(res[i][j] +" ");
			}
			System.out.println();
		}

	}

}
