package day23foreachloopdatetime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DateTime01 {

	public static void main(String[] args) {
		/*
		 	Java'da LocalDate Class'i vardir
		 */
		
		LocalDate date1 = LocalDate.now();
		System.out.println(date1); //2020-10-08
		
		System.out.println(date1.plusDays(3)); //2020-10-11
		System.out.println(date1.plusMonths(2)); //2020-12-08
		System.out.println(date1.plusYears(4));
		System.out.println(date1.plusDays(3).plusMonths(2));
		
		System.out.println(date1.minusDays(11));//2020-09-27
		System.out.println(date1.minusMonths(11)); //2019-11-08
		System.out.println(date1.minusYears(4));//2016-10-08
		System.out.println(date1.plusYears(3).minusMonths(4)); //2023-06-08
		
		//Java'da LocalTime Class'i vardir
		
		LocalTime time1 = LocalTime.now();
		System.out.println(time1 );
		System.out.println(time1);//22:47:10.663
		System.out.println(time1.plusMinutes(12));//22:59:10.663
		System.out.println(time1.plusHours(3));//01:48:00.400
		System.out.println(time1.minusMinutes(13));//22:35:45.356
		System.out.println(time1.minusHours(3));//19:49:27.299
		
		//Baska ulkelerin saatini bulmak
		LocalTime time2 = LocalTime.now(ZoneId.of("Europe/Moscow"));
		
				System.out.println(time2); //04:58:02.678
				
		//Tarihlerin formatlarini degistirmek
		//Tarih formatlarini degistirmek icin DateTimeForMatter Class'ini kullanilir.
				
		DateTimeFormatter dft1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println(date1.format(dft1));//08/10/2020
		
		DateTimeFormatter dft2 = DateTimeFormatter.ofPattern("dd/MMM/yyyy");
		System.out.println(date1.format(dft2)); //08/Oct/2020
		
		DateTimeFormatter dft3 = DateTimeFormatter.ofPattern("dd/MMMM/yyyy");
		System.out.println(date1.format(dft3)); //08/October/2020
		
		DateTimeFormatter dft4 = DateTimeFormatter.ofPattern("d/MMMM/yyyy");
		System.out.println(date1.format(dft4)); //8/October/2020
		
		DateTimeFormatter dft5 = DateTimeFormatter.ofPattern("MMMM/yy/d");
		System.out.println(date1.format(dft5)); //October/20/8
		
		DateTimeFormatter dft6 = DateTimeFormatter.ofPattern("MMMM/d");
		System.out.println(date1.format(dft6));
		
		//Zaman formatini degistirmek
		DateTimeFormatter dtf6 = DateTimeFormatter.ofPattern("hh:mm");
		System.out.println(time1.format(dtf6) + " pm"); //11:14 pm
			
		DateTimeFormatter dtf7 = DateTimeFormatter.ofPattern("HH:mm");
		System.out.println(time1.format(dtf7)); //23:14
	}

}
