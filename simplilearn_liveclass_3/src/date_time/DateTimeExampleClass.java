package date_time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DateTimeExampleClass {
	
	public static void main(String[] args) {
		//Dd
		LocalDate currentLocalDate = LocalDate.now();
		LocalDate kholiDob = LocalDate.parse("05/11/1988",DateTimeFormatter.ofPattern("dd/MM/YYYY"));
		
		long age = ChronoUnit.YEARS.between(kholiDob, currentLocalDate);
        kholiDob = kholiDob.plusYears(age);
        
        System.out.println("Age "+ age);
	}
	
}

