package exceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Practice {

	void divide()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the values a and b:");
		try {
		int a=sc.nextInt();
		int b=sc.nextInt();
	
		System.out.println(a/b);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Cannot divide using given input.Try again");
			e.printStackTrace();
			divide();
		}
	    catch(InputMismatchException e)
		{
	    	System.out.println("Please enter relevant type of input:Try again");
	    	e.printStackTrace();
	    	divide();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		
		Practice c=new Practice();
		c.divide();
		

	}

}
