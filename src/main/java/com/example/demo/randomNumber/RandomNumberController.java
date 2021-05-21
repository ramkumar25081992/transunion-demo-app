package com.example.demo.randomNumber;

import java.util.Random;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RandomNumberController {
	
	@RequestMapping("/randomNumber")
	public Integer returnNumber(@RequestParam(value="lowerBound", defaultValue="1") int lowerBound, //lower bound value defaulted to '1' if unspecified
			@RequestParam(value="upperBound") int upperBound) {
		
		Random r = new Random();
		int low = lowerBound;
		int high = upperBound;
		
		//Logic to get a random number
		int result = r.nextInt(high-low) + low;
		
		//Logic to get a different random number if the result equals lower bound value
		while( result == low) {
	         result= r.nextInt(high-low) + low;
	      }
		
		return result;
	}
}
