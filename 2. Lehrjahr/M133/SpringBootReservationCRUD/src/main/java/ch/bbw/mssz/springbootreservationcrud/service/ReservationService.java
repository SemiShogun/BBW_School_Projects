package ch.bbw.mssz.springbootreservationcrud.service;

import ch.bbw.mssz.springbootreservationcrud.entity.Reservation;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * @author Matthias Stierlin
 * @version 03.05.2020
 */
@Service
public class ReservationService {

    private List<Reservation> reservations = new ArrayList<>(Arrays.asList(
            new Reservation(1, "2020-05-16","Familie Müller, 4 Personen"),
            new Reservation(2, "2020-05-17","Familie Bachmann, 3 Personen"),
            new Reservation(3, "2020-05-21","Familie Deutsch, 5 Personen")
    ));

    public List<Reservation> getAllReservations(){
        if(reservations.isEmpty()){
            return null;
        }
        return reservations;
    }

    public void addReservation(Reservation reservation) {
        reservations.add(reservation);
    }

    public Reservation getReservation(long id) {
        Reservation reservation = null;
        for(Reservation selectedReservation : reservations) {
            if(selectedReservation.getId() == id){
                reservation = selectedReservation;
                break;
            }
        }
        return reservation;
    }

    public void updateReservation(long id, Reservation reservation) {
        for(int i = 0; i<reservations.size(); i++) {
            Reservation tempReservation = reservations.get(i);
            if(tempReservation.getId() == id) {
                reservations.set(i, reservation);
            }
        }
    }

    public void deleteReservation(long id) {
        for(Reservation reservation : reservations) {
            if(reservation.getId() == id) {
                reservations.remove(reservation);
                break;
            }
        }
    }
}
