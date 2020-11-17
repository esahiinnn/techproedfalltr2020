package homeworkdowhile;

import java.util.Scanner;

public class Soru07 {

	public static void main(String[] args) {
		/*
		 Kullanıcıdan isim ve soyismini alın.
		  Kullanıcının isim ve soyisminin ilk harflerini büyük diğer harflerini küçük harf olarak ekrana yazdıran programı yazınız.
		 */

				Scanner scan = new Scanner(System.in);
				System.out.println("isminizi giriniz");
				String a = scan.nextLine();
				System.out.println("Soyisminizi giriniz");
				String b = scan.nextLine();
				
				buyutme(a,b);
		
		scan.close();
	}

	
		public static void buyutme(String a, String b) {
			System.out.print(a.substring(0,1).toUpperCase());
			System.out.println(a.substring(1).toLowerCase());
			System.out.print(b.substring(0,1).toUpperCase());
			System.out.println(b.substring(1).toLowerCase());
		}
}
