package ch.bbw.jl.springbootrentabike;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.*;

/**
 * Rental
 * 
 * @author Jamie Lam
 * @version 19.06.2020
 */
// Es wäre auch möglich ein session zu machen.
// @Scope(value="session", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class  Rental {

	@NotEmpty(message = "Biketype darf nicht leer sein.")
	private String biketype;

	@NotEmpty(message = "Accessoire darf nicht leer sein.")
	private String accessoire;

	@Future
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date rentaldate = java.util.Date.from(LocalDateTime.now().atZone(ZoneId.systemDefault()).toInstant());

	@Min(value = 1, message = "zu wenig")
	@Max(value = 31, message = "zu gross")
	private int numberofdays;

	@NotEmpty(message = "Name darf nicht leer sein.")
	@Size(min=3, max=23, message = "Die Länge des Namens muss zwischen 2 und 8 sein.")
	private String name;

	@Email(regexp = ".+\\@.+\\..+",message = "Invalid E-mail Address")
	private String email;

	@Override
	public String toString() {
		return "Rental [biketype=" + biketype + ", accessoire=" + accessoire + ", rentaldate=" + rentaldate
				+ ", numberofdays=" + numberofdays + ", name=" + name + ", email=" + email + "]";
	}

	public String getBiketype() {
		return biketype;
	}

	public void setBiketype(String biketype) {
		this.biketype = biketype;
	}

	public String getAccessoire() {
		return accessoire;
	}

	public void setAccessoire(String accessoire) {
		this.accessoire = accessoire;
	}

	public Date getRentaldate() {
		return rentaldate;
	}

	public void setRentaldate(Date rentaldate) {
		this.rentaldate = rentaldate;
	}

	public int getNumberofdays() {
		return numberofdays;
	}

	public void setNumberofdays(int numberofdays) {
		this.numberofdays = numberofdays;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
