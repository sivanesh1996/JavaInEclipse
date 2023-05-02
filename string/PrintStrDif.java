package string;

import java.util.Scanner;

public class PrintStrDif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a word:");
		String s=sc.nextLine();
		String s1="";
		int i=0;
		
		while(i<s.length()) {
			s1=s1+s.charAt(i);
			System.out.println(s1);
			i++;
		}
		

	}

}
