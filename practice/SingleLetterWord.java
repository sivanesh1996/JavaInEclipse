package practice;

public class SingleLetterWord {

	public static void main(String[] args) {
		String s="Iam a good boy";
		String arr[]=s.split(" ");
		//String s1[]=new String[s.length()];
		int count=0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i].length()==1) {
				System.out.println(arr[i]);
			}
			else {
				count++;
			}
		}
		if(count==arr.length) {
			System.out.println("No single letter word found");
		}

	}

}
