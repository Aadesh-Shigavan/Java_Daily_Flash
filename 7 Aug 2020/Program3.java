class Divisible {

	public static void main(String[] args) {
		
		int num ;

		int num2 = 1;

		int count = 0;

		while(count <= 10){

			if(num2 % 7 ==0 && num2 % 32 == 0 && num2 % 6 == 0){
				break;
				 	
			}
			else if(num2 % 7 ==0 && num2 % 32 == 0){
				System.out.println(num2 + " ");
				num2++;
				count++;
			}
			else{
				num2++;
			}
			
	}
	System.out.println(num2 + " is Divisible by 6");
}
}