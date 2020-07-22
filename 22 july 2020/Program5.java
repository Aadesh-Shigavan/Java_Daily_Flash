class Marvel {

	public static void main(String[] args) {
		
		Marvel batman = null;

		Marvel superman = null;

		Marvel aquaman = null;

		Marvel ironman = new Marvel();

		boolean benAffleck = batman instanceof Marvel;
		System.out.println("is Batman Belongs to Marvel -->" + benAffleck); 	//false


		boolean henryCavill = superman instanceof Marvel;
		System.out.println("is Superman Belongs to Marvel -->" + henryCavill);	//false


		boolean jasonMomoa = aquaman instanceof Marvel;
		System.out.println("is Aquaman Belongs to Marvel -->" + jasonMomoa);	//false


		boolean robertDowney = ironman instanceof Marvel;
		System.out.println("is Ironman Belongs to Marvel -->" + robertDowney);	//true
	}
}