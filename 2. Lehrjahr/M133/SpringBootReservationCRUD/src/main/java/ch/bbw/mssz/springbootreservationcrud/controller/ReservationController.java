package ch.bbw.mssz.springbootreservationcrud.controller;

import ch.bbw.mssz.springbootreservationcrud.entity.Reservation;
import ch.bbw.mssz.springbootreservationcrud.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * ReservationController.java
 *
 * @author Matthias_Stierlin
 * @version 20.03.2020
 */
@Controller
public class ReservationController {

    @Autowired
    private ReservationService reservationService;

    @GetMapping("/listReservations")
    public String listReservations(Model model) {
        model.addAttribute("listOfReservations", reservationService.getAllReservations());
        return "reservationlist";
    }

    @GetMapping("/addreservation")
    public String getRequestReservation(Model model) {
        Reservation value = new Reservation();
        value.setId(Reservation.getNextId());
        model.addAttribute("reservation", value);

        System.out.println(model.asMap().get("reservation").toString());
        return "inputform";
    }

    @PostMapping("/addreservation")
    public String postRequestReservation(@ModelAttribute Reservation reservation, Model model) {
        reservationService.addReservation(reservation);
        Reservation.incrementNextId();
        return "redirect:/listReservations";
    }

    @GetMapping("/editreservation/{id}")
    public String editReservation(@PathVariable("id") long id, Model model) {
        Reservation reservationId = reservationService.getReservation(id);
        model.addAttribute("reservation", reservationId);
        return "editreservation";
    }

    @PostMapping("/editreservation")
    public String postEditReservation(Reservation reservation, Model model) {
        reservationService.updateReservation(reservation.getId(), reservation);
        return "redirect:/listReservations";
    }

    @GetMapping("/deletereservation")
    public String deleteReservation(@RequestParam(name="id", required = true) long id, Model model) {
        reservationService.deleteReservation(id);
        model.addAttribute("listOfReservations", reservationService.getAllReservations());
        return "reservationlist";
    }

    @GetMapping("/events")
    public String getEvents() {
        return "events";
    }

    @GetMapping("/ueberuns")
    public String getUeberuns() {
        return "ueberuns";
    }
}
