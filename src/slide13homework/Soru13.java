package slide13homework;

import java.util.Scanner;

public class Soru13 {

	public static void main(String[] args) {
		/*
		 Kullanıcıdan bir String alın ve bu String’in icinde “a�? harfi varsa “a�? harfinin ilk görünümünün  indexini ekrana yazdırın.
		  “a�? harfi yoksa ekrana “a harfi yok�? yazdırın.
		 */

				Scanner scan = new Scanner(System.in);
				System.out.println("Bir String giriniz");
				String s = scan.nextLine();
				
				
				if(s.contains("a") ) {
					System.out.println(s.indexOf("a"));
				}else {
					System.out.println("a harfi yok");
				}
				scan.close();
	}

}
