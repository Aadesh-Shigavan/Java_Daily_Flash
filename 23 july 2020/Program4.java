// write a program to check whether is vowel or consonant 

class VowelCoso {

	static char a = 'b';

	public static void main(String[] args) {
		
		if (a == 'a' | a == 'e' | a == 'i' | a == 'o' | a == 'u'){
			System.out.println(a +" is vowel.");
		}

		if (a == 'A' | a == 'E' | a == 'I' | a == 'O' | a == 'U'){
			System.out.println(a + " is vowel.");
		}
		else {
			System.out.println(a + " is Consonant.");
		}
	}
}