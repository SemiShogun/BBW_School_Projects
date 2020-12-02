package ch.bbw.jl.restaurant.survey.model;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Activitiy
 * @author Peter Rutschmann
 * @version 20.06.2019
 */

@Component
@Scope(value="session", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class Activitiy {
	private List<String> allMeals = new ArrayList<>(Arrays.asList(
			"Znüni", 
			"Zmittag", 
			"Zvieri",
			"Znacht"
			));	
	
	private String meals;
	
	public String getMeals() {
		return meals;
	}

	public void setMeals(String meals) {
		this.meals = meals;
	}

	public List<String> getAllMeals() {
		return allMeals;
	}
}
