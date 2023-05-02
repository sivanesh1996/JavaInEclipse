package practice;

public class VowelCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="Apple";
		s=s.toLowerCase();
		int vowel=0;
		int consonent=0;
		
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			switch(c) {
			case('a'):vowel++;break;
			case('e'):vowel++;break;
			case('i'):vowel++;break;
			case('o'):vowel++;break;
			case('u'):vowel++;break;
			default:consonent++;
			}
			
		}
		System.out.println("No of vowels:"+vowel);
		System.out.println("No of consonents:"+consonent);

	}

}
