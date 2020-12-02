package ch.bbw.jl.springbootwithbootstrap.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/** ReservationController.java
 *
 * @author Jamie Lam
 * @version 28.02.2020
 */
@Controller
public class ReservationController {

    @GetMapping("/reservationlist")
    public String showReservations() {
        return "reservationlist";
    }
}
