class MaxNo{
	
	public static void main(String[] args) {
		
		int num = 12357798;
		int rem =0;
		int sum =0;
		int rev = 0;
		int max = 0; 


		
		while(num != 0){

			rem = num % 10;

		    if(rem >= max ){

		    	max = rem;
		    }
		    else{

		    	max = max;
		    }

			num = num /10;




		}


		System.out.println(max + " is greater number");
	}
}