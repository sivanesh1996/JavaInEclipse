package realWorldApp;
import java.util.Scanner;

public class Temperature {
	
	void methodSelector()
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		switch(a) {
		case 0:
			idk();
			break;
		case 1:
			farenheitToCel();
			break;
		case 2:
			celciusToF();
			break;
		case 3:
			toBoth();
			break;
		default:
			System.out.println("Kindly enter the correct option");
			methodSelector();
		}
		
	}
	

	float x=32;
	float y=5;
	float z=9;
	float temp=0;
	
	void farenheitToCel()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Temperature in Farenheit:");
		float a=sc.nextFloat();
		float b=y/z;
		temp=(a-x)*b;
		System.out.println("Temperature="+temp+" degree celcius");	
	}
	
	void celciusToF()
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Temperature in Celcius:");
		float a=sc.nextFloat();
		float b=z/y;
		temp=(a * b)+x;
		System.out.println("Temperature="+temp+" degree Farenheit");
		
	}
	
	void toBoth()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any numerical value:");
		
		
		float a=sc.nextFloat();
		System.out.println("Given value "+a+" is converted into both celcius and Farenheit:");
		float b=y/z;
		temp=(a-x)*b;
		System.out.println("Temperature="+temp+" degree celcius");
		
		 b=z/y;
		temp=(a * b)+x;
		System.out.println("Temperature="+temp+" degree Farenheit");
		
		
	}
	
	void idk()
	{
		for(float i=-20;i<=25;i+=5)
		{
			if(i==-20)
			{	
			System.out.print("Celsius"+" ");
			System.out.println("Farenheit");
			}
			System.out.print(i);
			float b=z/y;
			temp=(i * b)+x;
			System.out.println("  "+temp);
			
		}
	}
	
	public static void main(String[] args) {
		
		Temperature t=new Temperature();
		
		System.out.println("Welcome to temperature converter");
		System.out.println("Press\n 0 if dont know about Celsius to Farenheit conversion\n 1 for Farenheit to Celcius\n 2 for Celcius to Farenheit");
        System.out.println(" 3 for both celcius and Farenheit");
		t.methodSelector();
		
		
		
	}
	

}
