package practice;

public class Wrapper {

	public static void main(String[] args) {
		//String to int
		String s="45";
		int n=Integer.parseInt(s);
		int ns=Integer.valueOf(s);
		
		System.out.println(n+1);
		System.out.println(ns+2);
		
		//int to String
		int n1=33;
		String s1=Integer.toString(n1);
		System.out.println(s1+1);
		String s2=String.valueOf(n1);
		System.out.println(s2+2);
		StringBuilder sb=new StringBuilder();
		sb.append(n1);
		System.out.println(sb);

	}

}
