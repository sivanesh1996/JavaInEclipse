package string;

public class Wrapper {
	
	public static void main(String[] args)
	{
//Primitive dataType to non primitive dataType using Wrapper class
		//It is used to convert primitive dataType to String
		int i=91;
		String s=Integer.toString(i);
		System.out.println(s);
		System.out.println(i+2);
		System.out.println(s+2);
		

	    int i1=4;
	    String s1=s+i1;
	    System.out.println(s1);
	    
	    boolean bool=true;
	    String s2=Boolean.toString(bool);
	    String s3="Man";
	    System.out.println(s2+s3);
	    System.out.println(bool+s3);
	    
	    //This same conversion can be done using String class method valueOf
	    
	    int i2=5;
	    int i3=8;
	    String s4=String.valueOf(i2);
	    System.out.println(s4+i3);
	    System.out.println(i2+i3);
	    
	    boolean bool1=true;
	    String s5=String.valueOf(bool1);
	    String s6="Man";
	    System.out.println(s5+s6);
	    
	    //Next, conversion of non primitive dataType to primitive dataType
	    
	    String s7="92";
	    int i4=Integer.parseInt(s7); // string to int
	    int i5=8;
	    int i6=i4+i5;
	    System.out.println(i6);
		
	    String s8="9/";
	    //int i7=Integer.parseInt(s8);
	   // System.out.println(i7);  //Number Format Exception-error
	    
	    int a=10;
	    Integer a1=(Integer.valueOf(a));
	    System.out.println(a1);
	    
	    String s0="9";
	    int a2=Integer.valueOf(s0);
	    System.out.println(a2+1);
	}

}
