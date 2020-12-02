package ch.bbw.jl.restaurant.survey.model;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

/**
 * Teilnehmer
 * @author Peter Rutschmann
 * @version 18.06.2019
 */

@Component
@Scope(value="session", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class Attendee {
	private String prename;
	private String lastname;
	
	public String getPrename() {
		return prename;
	}
	public void setPrename(String prename) {
		this.prename = prename;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	@Override
	public String toString() {
		return "Attendee [prename=" + prename + ", lastname=" + lastname + "]";
	}
}
