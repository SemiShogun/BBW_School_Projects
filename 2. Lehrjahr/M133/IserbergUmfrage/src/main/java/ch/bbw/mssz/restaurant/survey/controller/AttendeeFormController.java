package ch.bbw.mssz.restaurant.survey.controller;

import ch.bbw.mssz.restaurant.survey.model.Activitiy;
import ch.bbw.mssz.restaurant.survey.model.ApplicationCounter;
import ch.bbw.mssz.restaurant.survey.model.Attendee;
import ch.bbw.mssz.restaurant.survey.model.SessionCounter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * Survey AttendeeFormController
 * 
 * @author Matthias Stierlin
 * @version 02.07.2020
 */
@Controller
public class AttendeeFormController {

	@Autowired
	private Attendee myAttendee;

	@GetMapping("/survey")
	public String requestAttendee(Model model) {
		model.addAttribute("attendee", myAttendee);
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
