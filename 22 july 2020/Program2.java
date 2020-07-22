class Instagram {

	static void Reel (Instagram songs,Instagram videos) {

		boolean RealFeatures ;

		RealFeatures = songs instanceof Instagram;

		System.out.println(RealFeatures);


		RealFeatures = videos instanceof Instagram;

		System.out.println(RealFeatures);

	}

	void Memes () {

		System.out.println("All types of Memes pages ");
	}
}


class Facebook {

	public static void main(String[] args) {
		
		Instagram songs = new Instagram();

		Instagram videos = new Instagram();

		Instagram.Reel(songs,videos);
	}
}