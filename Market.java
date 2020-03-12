package market;

import java.util.ArrayList;
import java.util.List;

public class Market {

	private List<MarketItem> items;
	
	public Market() {
		this.items = new ArrayList<>();
	}

	public List<MarketItem> getItems() {
		return items;
	}
	
	/**
	 * @param price
	 * @param Market 
	 * @return the list of items which are: 
	 *                 - new
	 *                 - below the given price
	 */
	public List<MarketItem> getNewItemsBelowOrEqualTo(int price) {
		List<MarketItem> result= new ArrayList<MarketItem>();

		// Loop on all market items
		for(MarketItem mi : this.items) {
		
			// If the item is cheaper than price  + if item is new -> add it
			if (mi.getPrice() <= price && mi.isNew() == true) {
				result.add(mi);
			}
		}
		
		return result;
			
	}
	
	public void addItem(MarketItem item) {
		this.items.add(item);
	}

	public int getNumberOfSecondHand() {
		int countItemNumberSecondHand= 0;
		
		for(MarketItem secondHand : this.items) {		
			if(secondHand.isNew() == false) {
				countItemNumberSecondHand++;
			}	
		}
		return countItemNumberSecondHand;
	}
	
	public boolean atLeast3ItemMakeNoise() {
		int countItemThatCanMakeNioce =0;
		boolean atLeast3Item = false;
		
		for(MarketItem item : this.items) {
			if(item.canMakeNoice()) {
				countItemThatCanMakeNioce++;
			}

			if(countItemThatCanMakeNioce >= 3) {
				atLeast3Item = true;
			}
		}
		return atLeast3Item;
	}
	
}
