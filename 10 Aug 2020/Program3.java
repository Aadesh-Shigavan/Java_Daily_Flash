class PrimeNo{

	public static void main(String[] args) {
		
		int i,j,count,num=20;


		for(i = 1; i < num; i++){
			count=0;

			for (j = 2; j < i/2 + 1; j++ ) {
				if(i%j == 0){
					count+=1;
					break;
				}
				
			}
			if(count == 0 && i != 1){
				System.out.print(i + " ");
			}

		}
		System.out.println();
	}
}