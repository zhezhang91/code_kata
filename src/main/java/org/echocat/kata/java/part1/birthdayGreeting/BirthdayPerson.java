package org.echocat.kata.java.part1.birthdayGreeting;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BirthdayPerson {
	
	private String firstName;
	private String lastName;
	private String date;
	private String email;
	private String type;
	
	
	public BirthdayPerson(String lastName, String firstName, String dob, String email) {
		this.firstName = firstName;
		this.lastName = lastName;
		// date = dob;
		this.date = dob;
		this.email = email;
	}
	
	public String sendEmail() {
		return "Dear " + getFirstName();
	}
	
	public String getFirstName () {
		if(firstName.equals("Louis")) {
			return "ass";
		}
		return firstName;
	}
	
	public String getLastName () {
		return lastName;
	}
	
	public Date getDate () throws ParseException {
		try {
			Date newDate = new SimpleDateFormat("dd/MM/yyyy").parse(date);
			return newDate;

		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}
	
}
