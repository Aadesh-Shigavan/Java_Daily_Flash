class Number {

	public static void main(String[] args) {
		
		int num = 100;

		System.out.println("Reverse Order :");

		for(int i=1; i < 101; i++){
			System.out.print(num + ",");
			num-=1;
			
		}

		System.out.println("");


		System.out.println("Divisible by 5");
		int num1 = 100;

		for(int i=1; i < 101; i++){
			
			if (num1 % 5 == 0){
				System.out.print(num1 + ",");
				num1-=1;
			}
			else{
				num1-=1;
			}
		}
		System.out.println("");
	}
}
			
			
		


