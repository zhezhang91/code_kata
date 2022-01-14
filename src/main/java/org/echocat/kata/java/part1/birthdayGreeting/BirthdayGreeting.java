package org.echocat.kata.java.part1.birthdayGreeting;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class BirthdayGreeting {
	
	private static final String COMMA_DELIMITER = ",";

	/**
	 * last_name, first_name, date_of_birth, email
 Doe, John, 1982/10/08, john.doe@foobar.com
 Ann, Mary, 1975/09/11, mary.ann@foobar.com
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 * @throws ParseException 
	 */
	public static void BirthdayGreetings () throws FileNotFoundException, IOException, ParseException {
		List<BirthdayPerson> records = new ArrayList<>();
		File file = new File("testData.csv");
		System.out.println("Attempting to read from file in: "+ file.getCanonicalPath());
		try (BufferedReader br = new BufferedReader(new FileReader(file.getCanonicalPath()))) {
			br.readLine();
		    String line = null;
		    while ((line = br.readLine()) != null) {
			        String[] values = line.split(COMMA_DELIMITER);
                System.out.println(values[0]);
		    	BirthdayPerson birthdayPerson = new BirthdayPerson(values[0], values[1], values[2], values[3]);
		        records.add(birthdayPerson);
		    }
		}
		
		
		for (BirthdayPerson person : records) {
			Date date = new Date();
			SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
			//if (person.getDate().equals(formatter.format(date))) {
				System.out.println(person.sendEmail());
			//}
		}
		
	}


}

