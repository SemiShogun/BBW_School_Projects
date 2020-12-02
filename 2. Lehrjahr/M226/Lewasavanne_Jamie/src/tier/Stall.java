package tier;

import java.util.ArrayList;
/**
 * Ein Tierstall
 * @author Peter Rutschmann
 * @version 1.6.2018
 */
public class Stall {
	private ArrayList<Saeugetier> meineTiere;

	public Stall() {
		super();
		meineTiere = new ArrayList<Saeugetier>();
	}

	// line 18: Changed default to public
	public void addTier(Saeugetier tier)
	{
		meineTiere.add(tier);
	}

	// line 24: Changed default to public
	public void print()
	{
		System.out.println("Im Stall wohnen:");
		for (Saeugetier value : meineTiere)
		{
			System.out.println("   Tier-Name: " + value.getName());
		}
	}
}
