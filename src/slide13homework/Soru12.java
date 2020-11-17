package slide13homework;

import java.util.Scanner;

public class Soru12 {

	public static void main(String[] args) {
		/*
		 Kullanıcıdan bir String alın ve bu String’in ilk harfi ile son harfinin yerlerini değiştirerek  ekrana yazdırın. 
		 Ornegin; Kullanıcı “Java�? girerse ekrana “aavJ�? yazdıracaksınız.
		 */

			
			Scanner scan = new Scanner(System.in);
			System.out.println("Bir String giriniz");
			String s = scan.nextLine();
			
			String ilkHarf = s.substring(0,1);
			String sonHarf = s.substring(s.length()-1, s.length());
			
	
				
			System.out.println(sonHarf+s.substring(1, s.length()-1) + ilkHarf);
			
			
			scan.close();
	}

}
