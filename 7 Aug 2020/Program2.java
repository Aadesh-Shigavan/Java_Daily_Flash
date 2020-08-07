class EvenOddAdd{

	public static void main(String[] args) {
		
	

	int rem = 0;

	int num = 12345;

	int even = 0;

	int odd = 0;

	int mul = 1;

	int temp = 0;



	while(num != 0){

		rem = num % 10;

		if(rem % 2 ==0){
			even+=rem;
		}
		else{
			
			mul = mul * rem;
		}

		num = num / 10;
	}

	System.out.println("Addition of even number : " + even);

	System.out.println("Multiplication of odd number : " + mul);

}
}