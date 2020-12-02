package ch.bbw.mssz.restaurant.survey.controller;

import ch.bbw.mssz.restaurant.survey.model.Activitiy;
import ch.bbw.mssz.restaurant.survey.model.Attendee;
import ch.bbw.mssz.restaurant.survey.model.Rating;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * RatingFormController
 *
 * @author Matthias Stierlin
 * @version 02.07.2020
 */
@Controller
public class RatingFormController {

    @Autowired
    Attendee attendee;

    @Autowired
    Activitiy activitiy;

    @Autowired
    Rating rating;

    @GetMapping("/ratingsurvey")
    public String saveActivity (Model model) {
        model.addAttribute("attendee", attendee);
        model.addAttribute("activity", activitiy);
        model.addAttribute("listOfRatings", rating.getRatings());
        model.addAttribute("rating", rating);
        return "survey/ratingform";
    }

    @PostMapping("/ratingsurvey")
    public String saveActivity(@ModelAttribute Rating ratingModel, @ModelAttribute Attendee attendeeModel) {
        rating.setRating(ratingModel.getRating());
        return "redirect:/surveythank";
    }
}
