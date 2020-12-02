package ch.bbw.mssz.restaurant.survey.controller;

import ch.bbw.mssz.restaurant.survey.model.ApplicationCounter;
import ch.bbw.mssz.restaurant.survey.model.Attendee;
import ch.bbw.mssz.restaurant.survey.model.SessionCounter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * ThanksController
 *
 * @author Matthias Stierlin
 * @version 02.07.2020
 */
@Controller
public class ThanksFormController {
    @Autowired
    SessionCounter sessionCounter;
    @Autowired
    ApplicationCounter applicationCounter;
    @Autowired
    Attendee attendee;

    @GetMapping("/surveythank")
    public String requestThanks(Model model) {
        System.out.println(sessionCounter);
        model.addAttribute("attendee", attendee);
        model.addAttribute("surveys",applicationCounter);
        return "survey/thanksform";
    }
}
