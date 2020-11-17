package homeworks11;

import java.util.Scanner;

public class Soru05 {

	public static void main(String[] args) {
		// Kullanıcıdan yaşadığı ülkenin ismini alın bu ülkenin ilk iki harfini büyük harf olarak ekrana yazdırın.

		
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Yasadiginiz ulkeyi giriniz");
		String a = scan.nextLine();
		
		a = a.substring(0, 2).toUpperCase() + a.substring(2);
		System.out.println(a);
		
		scan.close();
		
	}

}
