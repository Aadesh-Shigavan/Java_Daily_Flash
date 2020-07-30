import java.util.Scanner;

class Calculator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Numbers : ");

		int a = sc.nextInt();

		System.out.println("Enter Numbers : ");

		int b = sc.nextInt(); 

		System.out.println("Enter Operator : ");

		char ch = sc.next().charAt(0);

		int output ;

		switch(ch) {

			case '+' :
						output = a + b;
						System.out.println("Answer : " + output);
						break;

			case '-' :
						output = a - b;
						System.out.println("Answer : " + output);
						break;


			case '%' :
						output = a % b;
						System.out.println("Answer : " + output);
						break;

			case '*' :
						output = a * b;
						System.out.println("Answer : " + output);
						break;

			case '/' :
						output = a / b;
						System.out.println("Answer : " + output);
						break;
			default :
					System.out.println("Enter Valid OPerator !" );

		}

	}
}