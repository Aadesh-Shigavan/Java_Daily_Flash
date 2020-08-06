class Scholarship {
	public static void main(String[] args) {
		
		int student_year = 3;

		


		switch(student_year){

			case 1:
					System.out.println("Not Eligible");
					break;

			case 2 :
					System.out.println("Not Eligible");
					break;

			case 3:
					{
						int student_marks = 80;

						switch(student_marks){

							case 30 :
									System.out.println("Fail: Student Not Eligible for Scholarship !");
									break;

							case 80 :
									System.out.println("Pass: Student Eligible for Scholarship !");
									break;

							default:
									System.out.println("Pass Student are Eligible and Failed are Not Eligible");

						}
					}
		}
	}
}