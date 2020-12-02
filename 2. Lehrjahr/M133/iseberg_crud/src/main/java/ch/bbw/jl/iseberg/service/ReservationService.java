package ch.bbw.jl.iseberg.service;

import ch.bbw.jl.iseberg.entities.Reservation;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ReservationService {
    private List<Reservation> reservations = new ArrayList<>(Arrays.asList(
            new Reservation(1, "Familie Muster, 4 People"),
            new Reservation(2, "Familie Kuster, 2 People"),
            new Reservation(3, "Familie Liechti, 5 People")
    ));

    public List<Reservation> getAllReservations() {
        return reservations;
    }

    // This method is a O(1) operation as is seriously slow... It would be better if I just used a map LOL :(
    // I hate this
    // I really hate this
    // But there is no other way
    public Reservation getReservation(long id) {
        Reservation reservedReservation = null;
        for(Reservation reservation : reservations) {
            if(reservation.getId() == id) {
                reservedReservation = reservation;
                break;
            }
        }
        return reservedReservation;
    }

    // I literally could not find any other way to solve this
    // A map would definitely be useful now...
    public void updateReservation(long id, Reservation reservation) {
        for (int i = 0; i < reservations.size(); i++) {
            Reservation reservedReservation = reservations.get(i);
            if (reservedReservation.getId() == id) {
                reservations.set(i, reservation);
                return;
            }
        }
    }

    // :) This is the worst loop I've ever made
    public void addReservation(Reservation reservation) {
        reservations.add(reservation);
    }

    public void removeReservation(long id) {
        reservations.remove(getReservation(id));
    }
}
