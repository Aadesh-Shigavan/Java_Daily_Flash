/* Write a java program to check number is even or odd  */

class Number {

	int a ;

	void evenOdd(int a) {

		if (a % 2 == 0){
			System.out.println(a + " is even number.");

		}
		else {
			System.out.println(a + " is odd number.");
		}
	}

	public static void main(String[] args) {
		
		Number evod = new Number();

		evod.evenOdd(1);
	}
}