package ch.bbw.jl.springbootinputform;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

/** InputFormController.java
 *
 * @author Jamie Lam
 * @version 06.03.2020
 */
@Controller
public class InputFormController {
    @GetMapping("/addreservation")
    public String getRequestReservation(Model model) {
        model.addAttribute("reservation", new Reservation());
        System.out.println(model.asMap().get("reservation").toString());
        return "inputform";
    }

    @PostMapping("/addreservation")
    public String postRequestReservation(@ModelAttribute Reservation reservation, Model model) {
        System.out.println(reservation.toString());
        System.out.println(model.asMap().get("reservation").toString());
        return "resultform";
    }


}
