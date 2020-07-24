// write a java program to get any number and check whether number greater,equal or smaller than the other

class Greater {

	static int a = 10;

	static int b = 20;

	public static void main(String[] args) {
		
		if (a > b){
			System.out.println(a + " is Greater than " + b);
		}

		if (a < b){
			System.out.println(b + " is Greater than " + a);
		}

		if (a == b) {
			System.out.println(a + " is Equal to " + b);

		}
	}
}