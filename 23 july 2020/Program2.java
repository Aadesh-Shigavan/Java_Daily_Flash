class Angle {

	static int angle = 90;

	public static void main(String[] args) {
		
		System.out.println("Angle : " + angle);

		if (angle < 90){
			System.out.println("Acute angle");
		}
		if (angle == 90) {
			System.out.println("Right angle");
		}
		if ((angle > 90) & (angle < 180)) {
			System.out.println("Obtuse angle");
		}
	}
}