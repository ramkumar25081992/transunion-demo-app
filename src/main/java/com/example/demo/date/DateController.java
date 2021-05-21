package com.example.demo.date;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DateController {
	
	@RequestMapping("/time")
	public String returnDate() {
		
		//Note: I have set the time zone to 'PST' even though it was not mentioned in the assignment to differentiate the Time offset
		TimeZone timeZone = TimeZone.getTimeZone("PST");
		//Note: I have used 'dd' for date formating to display day of the month as 'DD' displays day of the year 
		DateFormat dateFormat = new SimpleDateFormat("YYYY-MM-dd'T'hh:mm:ssZ");
		dateFormat.setTimeZone(timeZone);
		String currentTime = dateFormat.format(new Date());
		return currentTime;
	}

}