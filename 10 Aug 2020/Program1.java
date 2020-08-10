class Cubes{

	public static void main(String[] args) {

		int cube;
		
		for(int i = 1; i <= 50; i++){
			if(i % 2 == 1){
				cube = i * i * i;
				System.out.println("Cube of " + i + " : " + cube);
			}
		}
		System.out.println();
	}
}