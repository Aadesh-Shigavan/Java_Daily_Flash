import java.util.Scanner;

class Lang {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Character : ");

		char character = sc.next().charAt(0);

		switch(character){

			case 'J' :
					  System.out.println("Language : Java");
					  break;

			case 'C' :
					  System.out.println("Language : C and C++");
					  break;

			case 'P' :
					  System.out.println("Language : Python");
					  break;

			case 'A' :
					  System.out.println("Language : Android");
					  break;

			case 'F' :
					  System.out.println("Language : Flutter");
					  break;
			default :
					  System.out.println("Enter valid Character !");
		}
	}

}