package ch.bbw.mssz.restaurant.survey.controller;

import ch.bbw.mssz.restaurant.survey.model.Activitiy;
import ch.bbw.mssz.restaurant.survey.model.Attendee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * ActivityFormController
 * 
 * @author Matthias Stierlin
 * @version 02.07.2020
 */
@Controller
public class ActivityFormController {

	@Autowired
	Attendee myAttendee;

	@Autowired
	Activitiy myActivity;

	@GetMapping("/activitysurvey")
	public String requestActivity(Model model) {
		model.addAttribute("attendee", myAttendee);
		model.addAttribute("activity", myActivity);
		model.addAttribute("listOfMeals", myActivity.getAllMeals());
		return "survey/activityform";
	}

	@PostMapping("/activitysurvey")
	public String saveActivity(@ModelAttribute Activitiy activity) {
		myActivity.setMeals(activity.getMeals());
		System.out.println("saveActivity(); " + myActivity.getMeals());
		return "redirect:/ratingsurvey";
	}

}
