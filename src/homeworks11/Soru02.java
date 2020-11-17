package homeworks11;

import java.util.Scanner;

public class Soru02 {

	public static void main(String[] args) {
		// Kullanıcıdan ilk ve soy ismini alın ilk ve soy isminin kaç harften oluştuğunu ekrana yazdırın
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Adinizi giriniz");
		String ad = scan.nextLine();
		System.out.println("Soyadinizi giriniz");
		String soyAd = scan.nextLine();
		
		ad = ad.replace(" ", "");
		soyAd = soyAd.replace(" ", "");
		
		System.out.println("Adiniz " + ad.length() + " harften olusuyor");
		System.out.println("Soyadiniz " + soyAd.length() + " harften olusuyor");
		scan.close();
		
	}

}
