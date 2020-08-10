class Addition {

	public static void main(String[] args) {
		
		int a = 1;

		int b = 10;

		int sum; 

		for(int i = 1; i <=10; i++){

			sum = a + b;

			System.out.println(a + " + " + b + " = " + sum);
			a++;
			b--;
		}
	}
}