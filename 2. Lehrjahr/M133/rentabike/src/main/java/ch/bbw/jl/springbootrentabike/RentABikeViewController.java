package ch.bbw.jl.springbootrentabike;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * RentABikeViewController
 *
 * @author Jamie Lam
 * @version 19.06.2020
 */
@Controller
public class RentABikeViewController {
	List<String> bikeTypes = new ArrayList<>(Arrays.asList(
			"Urban-Bike",
			"Mountain-Bike"));
	
	List<String> accessoires = new ArrayList<>(Arrays.asList(
			"Licht",
			"Helm"));

	@GetMapping("/")
	public String rentABike(Model model) {
		model.addAttribute("bikeTypeAllValues", bikeTypes);
		model.addAttribute("accessoireAllValues", accessoires);
		model.addAttribute("rental", new Rental());
		return "rentabike";
	}

	@ExceptionHandler(value = NullPointerException.class)
	@PostMapping("/rentabike")
	public String addRental(Model model, @Valid Rental rental, BindingResult bindingResult) {

		System.out.println("addRental(): " + rental);
		model.addAttribute("rental", rental);
		return "rentalinfo";
	}	
}
