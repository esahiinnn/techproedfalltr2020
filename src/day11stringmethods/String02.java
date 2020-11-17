package day11stringmethods;

import java.util.Scanner;

public class String02 {

	public static void main(String[] args) {
		/*
		 	1)Kullanicidan password'unu aliniz
		 	2)Password a)Ilk karakteri buyuk harf olucak
		 						b)Son karakteri sayi olucak
		 						c)en az 6 karakter olucak uzunlugunda olucak
		 			sartlarini sagliyorsa 
		 */
		
		Scanner scan = new Scanner(System.in);
		//1)Kullanicidan password'unu aliniz
		System.out.println("Lutfen passwordunuzu giriniz");
		String pwd = scan.nextLine();
		// a)Ilk karakteri buyuk harf olucak
		if ((pwd.charAt(0) >= 'A' && pwd.charAt(0) <='Z' ) && (pwd.charAt(pwd.length()-1) >= '0' && pwd.charAt(pwd.length()-1) <= '9') && pwd.length()>5 )  {
			System.out.println("Password basariyla olusturuldu");
			
		}else {
			System.out.println("Tekrar deneyiniz");
		}
		
		
			
scan.close();
	}

}
