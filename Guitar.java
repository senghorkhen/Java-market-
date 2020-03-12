package market;

public class Guitar extends MusicIntrument {

	private final int nbOfStrings;
	
	public Guitar(int price, boolean isNew, int nbOfStrings) {
		super(price, isNew);
		
		this.nbOfStrings = nbOfStrings;
	}


}
