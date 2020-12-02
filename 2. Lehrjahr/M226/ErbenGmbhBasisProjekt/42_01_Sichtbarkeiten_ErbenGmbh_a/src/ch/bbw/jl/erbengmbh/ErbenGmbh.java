package ch.bbw.jl.erbengmbh;

import ch.bbw.jl.consultgmbh.Consultant;
import ch.bbw.jl.erbengmbh.employees.Manager;
import ch.bbw.jl.erbengmbh.employees.Mitarbeiter;
import ch.bbw.jl.erbengmbh.employees.Sales;

/**
 * Application Erben Gmbh
 * 
 * @author Jamie Lam
 * @version 20.03.2020
 */
public class ErbenGmbh {

	public static void main(String[] args) {
		Mitarbeiter mitarbeiterA = new Mitarbeiter("Paul", "Muster", 6000.0);
		Manager managerB = new Manager("Rolf", "Rain", 12000.0, 2000.0);
		Sales verkaeuferC = new Sales("Volker", "Voll", 8000.0, 1500.0);
		Consultant beraterD = new Consultant("Karl", "Glanz", 9000.0, 900.0);
		
		System.out.println("Lohnliste der Erben-Gmbh:");
		System.out.println();
		System.out.println("Lohn von Mitarbeiter A: " + mitarbeiterA.getFirstname() + " " + mitarbeiterA.getLastname()
				+ " " + mitarbeiterA.getLohn());
		System.out.println("Lohn von Manager B: " + managerB.getFirstname() + " " + managerB.getLastname() + " " +
				managerB.getLohn());
		System.out.println("Lohn von Verkaeufer C: " + verkaeuferC.getFirstname() + " " + verkaeuferC.getLastname()
				+ " " + verkaeuferC.getLohn());
		System.out.println("Lohn von Berater D: " + " " + beraterD.getFirstname() + " " + beraterD.getLastname() + " "
				+ beraterD.getLohn());
	}
}
