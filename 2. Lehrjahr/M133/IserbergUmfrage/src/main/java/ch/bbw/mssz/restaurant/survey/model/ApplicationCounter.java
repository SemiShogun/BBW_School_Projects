package ch.bbw.mssz.restaurant.survey.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * ApplicationCounter
 *
 * @author Matthias Stierlin
 * @version 02.07.2020
 */
@Component
@Scope(value = "singleton")
public class ApplicationCounter {

    private int countOverall = 0;
    private int countOpenSessions=0;

    public int getCountOverall() {
        return countOverall;
    }

    public int getCountOpenSessions() {
        return this.countOpenSessions;
    }

    public void incrementCountOverall() {
        countOverall++;
        System.out.println("incrementCountOverall: " + countOverall);
    }

    public void incrementCountOpenSessions() {
        countOpenSessions++;
        System.out.println("incrementCountOpenSessions: " + countOpenSessions);
    }

    public void decrementCountOpenSessions() {
        countOpenSessions--;
        System.out.println("decrementCountOpenSessions: " + countOpenSessions);
    }

    @Override
    public String toString() {
        return "ApplicationCounter [" + countOverall + "/" + countOpenSessions+"]";
    }
}
