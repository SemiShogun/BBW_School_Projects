package ch.bbw.jl.restaurant.survey;

import ch.bbw.jl.restaurant.survey.model.SessionCounter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import ch.bbw.jl.restaurant.survey.model.Attendee;
import ch.bbw.jl.restaurant.survey.model.Activitiy;

/**
 * ActivityFormController
 * 
 * @author Peter Rutschmann
 * @version 20.06.2019
 */
@Controller
public class ActivityFormController {

	@Autowired
	Attendee myAttendee;

	@Autowired
	Activitiy myActivity;

	@Autowired
	SessionCounter sessionCounter;

	@GetMapping("/activitysurvey")
	public String requestActivity(Model model) {
		model.addAttribute("attendee", myAttendee);
		model.addAttribute("activity", myActivity);
		model.addAttribute("listOfMeals", myActivity.getAllMeals());
		model.addAttribute("surveys", sessionCounter);
		return "survey/activityform";
	}

	@PostMapping("/activitysurvey")
	public String saveActivity(@ModelAttribute Activitiy activity) {
		myActivity = activity;
		System.out.println("saveActivity(); " + myActivity.getMeals());
		return "redirect:/thanksform";
	}
}
