package prep;

public class VowelCount {

	public static void main(String[] args) {
		String s="Apple";
		s=s.toLowerCase();
		int countVowel=0;
		int countCons=0;
		
	 for(int i=0;i<s.length();i++) {
		 char ch=s.charAt(i);
		switch(ch) {
		case 'a': countVowel++; break;
		case 'e': countVowel++; break;
		case 'i': countVowel++; break;
		case 'o': countVowel++; break;
		case 'u': countVowel++; break;
		default : countCons++; break;
		}
			}
System.out.println("Count of vowels:"+countVowel);
System.out.println("Count of consonents:"+countCons);
}
}
