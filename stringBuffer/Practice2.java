package stringBuffer;

public class Practice2 {

	public static void main(String[] args) {
		
		String names[]= {"Siva","Ganapathy","Krishna"};
		String name="";
		StringBuffer s=new StringBuffer("");
		
		for(int i=0;i<names.length;i++)
		{
			name=name+names[i];
			//System.out.println(name);
			System.out.println("String hash code:"+name.hashCode());
			
			s.append(names);
			System.out.println("StringBuffer hash code:"+s.hashCode());
		}
		

	}

}
