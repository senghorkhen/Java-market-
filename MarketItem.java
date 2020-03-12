package market;

public interface MarketItem {

	/**
	 * @return the item price in dollars
	 */
	int getPrice();
	
	/**
	 * @return true if this item is new and  false if second hand
	 */
	boolean isNew();
	
	boolean canMakeNoice();
}
