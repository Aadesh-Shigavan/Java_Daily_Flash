class Table {

	public static void main(String[] args) {
		
		int num = 3;

		System.out.println("Table of 3 is - ");

		for(int i = 1; i <11; i++){

			int table = num * i;

			System.out.print(table + ",");

			
		}
		System.out.println("");

		System.out.println("Even Number present in table of 3 -");

		for(int i = 1; i <11; i++){

			int table = num * i;

			if(table % 2 == 0){
				System.out.print(table + ",");
			}
		}
		System.out.println("");
	}
}