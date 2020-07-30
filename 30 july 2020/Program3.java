import java.util.Scanner;

class Rto {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("RTO Code : ");

		String code = sc.nextLine();

		switch(code) {

			case "AP" :
						System.out.println("State name : Andra Pradesh");
						break;
			case "MH" :
						System.out.println("State name : Maharashtra");
						break;
			case "GA" :
						System.out.println("State name : Goa");
						break;
			case "MP" :
						System.out.println("State name : Madhya Pradesh");
						break;
			case "PB" :
						System.out.println("State name : Punjab");
						break;
			default :
						System.out.println("Enter Valid State code !");
		}
	}
}