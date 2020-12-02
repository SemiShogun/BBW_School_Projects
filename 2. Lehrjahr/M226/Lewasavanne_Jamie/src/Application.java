import tier.Giraffe;
import tier.GrevyZebra;
import tier.Nashorn;
import tier.Stall;

import java.awt.Color;

public class Application {

	public static void main(String[] args) {
		System.out.println("Die Lewa Savanne präsentiert sich.");
		System.out.println();
		
		System.out.println("Meine Tiere:");

		Giraffe myGiraffe = new Giraffe(Color.PINK, "Gisela", 2500);
		myGiraffe.print();
		
		GrevyZebra myZebra = new GrevyZebra(Color.BLACK, "Zolli", 73);
		myZebra.print();
		
		Nashorn myNashorn = new Nashorn(Color.GRAY, "Gunter", 4, "Stupsnase", 25);
		myNashorn.print();
		
		System.out.println();	
		Stall myStall = new Stall();
		myStall.addTier(myGiraffe);
		myStall.addTier(myZebra);
		// line 30: added myStall.addTier(myNashorn); again
		myStall.addTier(myNashorn);
		myStall.print();
	}
}
