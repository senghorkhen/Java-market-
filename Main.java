package market;

import java.util.List;

public class Main {

	public static void main(String args[]) {
		Market myMarket = new Market();
		
		Book ronanBookAboutJava  = new Book(2000, false);
		Piano ronanPiano = new Piano(400, false, "Yamaha");
		Piano ronanPiano1 = new Piano(400, true, "Yamaha");
		Piano ronanPiano2 = new Piano(400, true, "Yamaha");
		Guitar ronanGuitar = new Guitar(400, false, 6);
		
		myMarket.addItem(ronanBookAboutJava);
		myMarket.addItem(ronanPiano);
		myMarket.addItem(ronanPiano1);
		myMarket.addItem(ronanPiano2);
		myMarket.addItem(ronanGuitar);
		
		int result = myMarket.getNumberOfSecondHand();

		System.out.println("Result size shall be : " + result);
		
		System.out.println("at least 3 items can make noice: " + myMarket.atLeast3ItemMakeNoise());
		
	}
}
