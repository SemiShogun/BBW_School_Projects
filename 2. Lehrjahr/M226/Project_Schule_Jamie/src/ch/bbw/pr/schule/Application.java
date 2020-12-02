package ch.bbw.pr.schule;

import java.util.ArrayList;

import ch.bbw.pr.schule.personen.Lehrperson;
import ch.bbw.pr.schule.personen.Lernender;
import ch.bbw.pr.schule.personen.Person;
import ch.bbw.pr.schule.personen.Schulabwart;

/**
 * Schule Application
 * @author Laura Luethi
 * @modifiedby P. Rutschmann
 */
public class Application {
	//Nicht verändern
    public static void main(String[] args) {
        ArrayList<Person> personen = new ArrayList<Person>();
        personen.add(new Lernender("Bea", "Mayer"));
        personen.add(new Lernender("Hans", "Mueller"));
        personen.add(new Lernender("Paul", "Muster"));
        personen.add(new Lehrperson("Frederic", "Meier"));
        personen.add(new Schulabwart("Tom", "Escher"));

        System.out.println("Liste einiger Personen an der Schule und deren Aufgaben...\n");
        for (Person person : personen) {
            System.out.println(person.toString() + person.print());
            System.out.println(" und " + person.doWork());
            System.out.println();
        }
    }


//    private static String getAufgaben(Person person) {
//    	String text=null;
//
//        /* TODO: mittels instanceof die richtige Methode aufrufen
//         * Und den return-Wert text zuweisen. */
//
//        if (person instanceof Schulabwart) {
//            Schulabwart schulabwart = (Schulabwart) person;
//            text = schulabwart.repariertBeleuchtung();
//        } else if (person instanceof Lernender) {
//            Lernender lernender = (Lernender) person;
//            text = lernender.machtHausaufgaben();
//        } else if (person instanceof Lehrperson) {
//            Lehrperson lehrperson = (Lehrperson) person;
//            text = lehrperson.korrigiertPruefungen();
//        }
//
//    	return text;
//    }

}
