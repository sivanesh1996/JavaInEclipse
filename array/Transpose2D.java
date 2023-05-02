package array;

import java.util.Scanner;

public class Transpose2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of row:");
		int r=sc.nextInt();
		System.out.println("Enter the no of column:");
		int c=sc.nextInt();
		int arr[][]=new int [r][c];
		int res[][]=new int[c][r];
		System.out.println("Enter the" +r +" x " +c +" matrix one by one:");
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("Before Transpose:");
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				System.out.print(arr[i][j] +" ");
			}
			System.out.println();
		}
		
		System.out.println("After Transpose:");
		for(int i=0;i<c;i++) {
			for(int j=0;j<r;j++) {
				res[i][j]=arr[j][i];
				//00-10-20
				//01-11-21
				//
			}
			
		}
		
		for(int i=0;i<c;i++) {
			for(int j=0;j<r;j++) {
				System.out.print(res[i][j] +" ");
			}
			System.out.println();
		}
		sc.close();
		
		
		
	}

}
