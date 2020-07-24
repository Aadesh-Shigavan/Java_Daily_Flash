class Attendance {

	int attendance ;

	void isEligible (int attendance) {

		if (attendance > 75){
			System.out.println("Attendance " + attendance + " %" + " Student Eligible for Exam");

		}
		else {
			System.out.println("Attendance " + attendance + " %" + " Student Not Eligible for Exam");

		}
	}

	public static void main(String[] args) {
		
		Attendance exam = new Attendance();

		exam.isEligible(60);
	}
}