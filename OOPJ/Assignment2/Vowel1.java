class Vowel1{
	public static void main(String args[]){
		char ch = 'b';
		String s =(ch == 'a'|| ch == 'e' ||ch =='i' ||ch =='o' || ch =='u' || ch =='A'||ch =='E' ||ch =='I' ||ch =='O' ||ch =='U')? (ch + " is Vowel"): (ch + " is consonant");
		System.out.println(s);
	}
}