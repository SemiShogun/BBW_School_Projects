package ch.bbw.jl.iseberg.controller;

import ch.bbw.jl.iseberg.entities.Reservation;
import ch.bbw.jl.iseberg.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/** ReservationController.java
 *
 * @author Jamie Lam
 * @version 28.02.2020
 */
@Controller
public class ReservationController {

    @Autowired
    private ReservationService reservations;

    @GetMapping("/reservationlist")
    public String showReservations(Model model) {
        model.addAttribute("listOfReservations", reservations.getAllReservations());
        return "reservationlist";
    }

    @GetMapping("/addreservation")
    public String getRequestReservation(Model model) {
        long uniqueId = 0;
        for(int i = 0; i < reservations.getAllReservations().size() + 1; i++) {
            // i + 1 because of array reasons.
            if (reservations.getReservation(i + 1) == null) {
                uniqueId = i + 1;
            }
        }
        Reservation reservation = new Reservation(uniqueId, "");
        model.addAttribute("reservation", reservation);
        return "inputform";
    }

    @PostMapping("/addreservation")
    public String postRequestReservation(Reservation reservation, Model model) {
        reservations.addReservation(reservation);
        return "redirect:/reservationlist";
    }

    @GetMapping("/editreservation/{id}")
    public String getEditReservation(@PathVariable("id") long id, Model model) {
        Reservation reservation = reservations.getReservation(id);
        model.addAttribute("reservation", reservation);
        return "inputform";
    }

    @PostMapping("/editreservation")
    public String postEditReservation(Reservation reservation, Model model) {
        reservations.updateReservation(reservation.getId(), reservation);
        return "redirect:/reservationlist";
    }

    @GetMapping("/deletereservation")
    public String deleteReservation(@RequestParam(name="id", required=true) long id, Model model) {
        reservations.removeReservation(id);
        model.addAttribute("listOfReservations", reservations.getAllReservations());
        return "reservationlist";
    }
}
