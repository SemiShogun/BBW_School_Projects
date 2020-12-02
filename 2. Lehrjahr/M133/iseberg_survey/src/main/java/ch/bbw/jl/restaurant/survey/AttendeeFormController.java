package ch.bbw.jl.restaurant.survey;

import ch.bbw.jl.restaurant.survey.model.SessionCounter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import ch.bbw.jl.restaurant.survey.model.Attendee;

/**
 * Survey AttendeeFormController
 * 
 * @author Peter Rutschmann
 * @version 20.06.2019
 */
@Controller
public class AttendeeFormController {

	@Autowired
	Attendee myAttendee;

	@Autowired
	SessionCounter sessionCounter;

	@GetMapping("/survey")
	public String requestAttendee(Model model) {
		model.addAttribute("attendee", myAttendee);
		System.out.println(sessionCounter);
		model.addAttribute("surveys", sessionCounter);
		return "survey/attendeeform";
	}

	@PostMapping("/survey")
	public String saveAttendee(@ModelAttribute Attendee attendee) {
		myAttendee.setLastname(attendee.getLastname());
		myAttendee.setPrename(attendee.getPrename());
		System.out.println("saveAttendee(); " + myAttendee);
		return "redirect:/activitysurvey";
	}
}
