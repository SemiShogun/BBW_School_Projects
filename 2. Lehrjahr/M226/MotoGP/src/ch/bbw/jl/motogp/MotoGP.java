package ch.bbw.jl.motogp;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

public class MotoGP {

    public static void main(String args[]) {
        Driver[] driver = new Driver[] {
            new Driver("Driver 1", "lol", "2001-1-1"),
            new Driver("Driver 2", "kek", "2002-2-2"),
            new Driver("Driver 3", "nyt", "2003-3-3"),
            new Driver("Driver 4", "bob", "2004-4-4")
        };

        System.out.print("Drivers: " + "\n" + Arrays.toString(driver) + "\n");

        Team Yamaha = new Team(
                "Team Yamaha",
                "Japan",
                "Yamaha"
        );

        Team Kawasaki = new Team(
                "Team Kawasaki",
                "Japan",
                "Kawasaki"
        );

        // Assign the drivers
        Yamaha.setDrivers(driver[0], driver[1]);
        Kawasaki.setDrivers(driver[2], driver[3]);

        // Present the data
        System.out.print("Presenting the teams and their drivers!" + "\n\n"
                + "For our first team, we have team Yamaha! " + "\n" + Yamaha.toString() + "\n\n"
                + "For our second team, we have team Kawasaki! " + "\n" + Kawasaki.toString() + "\n"
                + "\n");

        // Reset the data
        System.out.println("Teams have been reset...");
        Yamaha.resetDrivers();
        Kawasaki.resetDrivers();
        System.out.print("\n" + "End of transmission...");

    }
}
