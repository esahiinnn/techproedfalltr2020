package homeworks11;

import java.util.Scanner;

public class Soru03 {

	public static void main(String[] args) {
		// Kullanıcıdan ilk ve soy ismini alın ilk ve soy isminin ilk harflerini büyük harf olarak ekrana yazdırın

				Scanner scan = new Scanner(System.in);
				System.out.println("Lutfen adinizi giriniz");
				String ad = scan.nextLine();
				System.out.println("Lutfen soyadinizi giriniz");
				String soyAd = scan.nextLine();
				
				ad = ad.substring(0,1).toUpperCase() +  ad.substring(1);
				soyAd = soyAd.substring(0,1).toUpperCase() + soyAd.substring(1, soyAd.length());
				System.out.println(ad + " " + soyAd);
				scan.close();
				
	}

}
