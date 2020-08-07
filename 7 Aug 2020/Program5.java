class Average{

	public static void main(String[] args) {
		
		int count = 0;

		int num = 12345;

		int rem ;

		int sum = 0;

		int average = 0;

		while(num != 0){

			rem = num % 10;

			count++;

			sum +=rem;

			num = num / 10;
		}



		average = sum / count;

		System.out.println("The Average of digits from number is " + average);


	}
}