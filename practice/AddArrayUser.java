package practice;

import java.util.Scanner;

public class AddArrayUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the numbers one by one:");
        for(int i=0;i<n;i++) {
        	arr[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<n;i++) {
        	sum=sum+arr[i];
        }
        System.out.println("total is:"+sum);
	}

}
