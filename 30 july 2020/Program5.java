import java.util.Scanner;

class EqualToZero {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number : ");

		int number = sc.nextInt();

		if (number == 0){
			System.out.println("Entered Number is Equal To Zero !");
		}
		else if (number > 0){
			System.out.println("Entered Number is greater than Zero !");	
		}
		else {
			System.out.println("Entered Number is Less To Zero !");
		}
	}
}