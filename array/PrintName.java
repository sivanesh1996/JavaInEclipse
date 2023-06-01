package array;

import java.util.Scanner;

public class PrintName {
	
	public void printYourName() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name:");
		String n=sc.nextLine();
		String arr[]=new String[1];
		arr[0]=n;
		
		for(int i=0;i<1;i++) {
			System.out.println("your name is :"+arr[i]);
		}
	}

	public static void main(String[] args) {
		PrintName obj=new PrintName();
		obj.printYourName();

	}

}
