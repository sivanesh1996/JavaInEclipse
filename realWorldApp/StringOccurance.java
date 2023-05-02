package realWorldApp;

public class StringOccurance {

	public static void main(String[] args) {
		
		String s="payilagam";
		int cc[]=new int[s.length()];
		
		for(int i=0;i<s.length();i++)
		{
			int count=1;
			boolean flag=true;
			
			for(int k=i-1;k>=0;k--)
			{
				if(s.charAt(i)==s.charAt(k))
					flag=false;
			}
			
			if(flag==true)
			{
				for(int j=i+1;j<s.length();j++)
				{
					if(s.charAt(i)==s.charAt(j))
						count++;
				
				}
				cc[i]=count;
			}
			
			
		}
		
		
		for(int i=0;i<s.length();i++)
		{
			if(cc[i]>0)
				System.out.println(s.charAt(i) +" " +cc[i]);

		}

	}

}
