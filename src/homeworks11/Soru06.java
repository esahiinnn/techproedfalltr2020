package homeworks11;

import java.util.Scanner;

public class Soru06 {

	public static void main(String[] args) {
		// Kullanıcıdan yaşadığı ülkenin ismini alın bu ülkenin bastan ikinci harfi ile sondan ikinci harfini  büyük harf olarak ekrana yazdırın.
		
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Yasadiginiz ulkeyi giriniz");
		
		String a = scan.nextLine();
		
		a = a.substring(1, 2).toUpperCase() + a.substring(a.length()-2, a.length()-1).toUpperCase();
		System.out.println(a);
		scan.close();

	}

}
