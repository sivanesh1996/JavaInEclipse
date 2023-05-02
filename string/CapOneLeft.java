package string;

public class CapOneLeft {

	public static void main(String[] args) {
		
		String s="Balamani";
		
		char arr[]=s.toCharArray();
		char arr1[]=new char[arr.length];
		
		for(int i=0;i<s.length();i++) {
			if(i%2==0)
			{
				if(arr[i]>90)
				{
				arr[i]=(char)(arr[i]-32);
				arr1[i]=arr[i];
				}
				else
				{
					arr1[i]=arr[i];
				}
			   
			
			}
			else
			{
				arr1[i]=arr[i];
			   
				
			}
			
			
		}
		//s=String.valueOf(arr1);
		//System.out.println(s);

		s=new String(arr);
		System.out.println(s);
	}

}
