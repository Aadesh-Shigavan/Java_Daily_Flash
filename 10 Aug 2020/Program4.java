class Factorial{
	public static void main(String[] args) {
		
		int num=10,fact = 1;	
		for(int i = 1; i<num;i++){
			for (int j = i;j>=1 ;j-- ) {
				fact = fact * j;
			}
			System.out.println("Factorial of " + i + ":" + fact);
			fact =1;
		}
	}
}