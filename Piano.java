package market;

public class Piano extends MusicIntrument {

	private final String brand;
	
	public Piano(int price, boolean isNew, String brand) {
		super(price, isNew);
		
		this.brand = brand;
	}

}
