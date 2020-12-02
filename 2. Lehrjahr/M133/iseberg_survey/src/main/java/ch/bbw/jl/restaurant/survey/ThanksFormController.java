package ch.bbw.jl.restaurant.survey;

import ch.bbw.jl.restaurant.survey.model.Attendee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ThanksFormController {

    @Autowired
    Attendee attendee;

    @GetMapping("/thanksform")
    public String requestThanks(Model model) {
        model.addAttribute("attendee", attendee);
        return "survey/thanksform";
    }

}
