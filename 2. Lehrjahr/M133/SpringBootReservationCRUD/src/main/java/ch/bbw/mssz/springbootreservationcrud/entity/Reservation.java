package ch.bbw.mssz.springbootreservationcrud.entity;

import java.time.LocalDate;

/**
 * Reservation.java
 *
 * @author Matthias_Stierlin
 * @version 20.03.2020
 */
public class Reservation {
    static private long nextId = 0;
    private long id;

    // I tried Localdate, but it resulted in a typemismatch.
    private String when;
    private String content;

    public Reservation(){
        super();
    }

    public Reservation(long id, String when, String content) {
        super();
        this.id = nextId;
        this.when = when;
        nextId++;
        this.content = content;
    }

    public static long getNextId() {
        return nextId;
    }

    public static void incrementNextId() {
        nextId++;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getWhen() {
        return when;
    }

    public void setWhen(String when) {
        this.when = when;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "id=" + id +
                ", content='" + content + '\'' +
                '}';
    }
}
