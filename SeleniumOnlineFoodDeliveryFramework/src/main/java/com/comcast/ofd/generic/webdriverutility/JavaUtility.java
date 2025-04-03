package com.comcast.ofd.generic.webdriverutility;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class JavaUtility {
	public int getRandomNumber() {
		Random ranDom= new Random();
		int ranDomNumber= ranDom.nextInt(5000);
		return ranDomNumber;
		}

	 
	 public  String generatePhoneNumber() {
	        Random random = new Random();
	        
	        // Choose a random first digit (6, 7, 8, or 9)
	        int firstDigit = random.nextInt(4) + 6; // Generates a number between 6 and 9
	        
	        // Generate the remaining 9 digits
	        StringBuilder phoneNumber = new StringBuilder();
	        phoneNumber.append(firstDigit);
	        
	        // Append 9 random digits
	        for (int i = 0; i < 9; i++) {
	            phoneNumber.append(random.nextInt(10)); // Append a digit between 0 and 9
	        }

	        return phoneNumber.toString();
	    }
	 
	 

	public String getSystemDateyyyyMMdd() {
		Date dateObj= new Date();
		SimpleDateFormat sdf= new SimpleDateFormat("YYYY-MM-dd");
		String	date= sdf.format(dateObj);
		
		return date;
		
	}
	 
	public String getRequiredDateyyyyMMdd(int days) {
		Date dateObj= new Date();
		SimpleDateFormat sim= new SimpleDateFormat("YYYY-MM-dd");
		 sim.format(dateObj);
		Calendar cal= sim.getCalendar();
		cal.add(Calendar.DAY_OF_MONTH,days);	
		String reqDate=sim.format(cal.getTime());
		return reqDate;
	}

}
