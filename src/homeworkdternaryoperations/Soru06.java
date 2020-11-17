package homeworkdternaryoperations;

import java.util.Scanner;

public class Soru06 {

	public static void main(String[] args) {
		/*
		 Artik Yil(Lep Year) : 100'e bolunen yillardan 400 e bolunenler artik yildir.
		 				   100'e bolunmeyenlerden 4'e bolunenler artil yildir
		 Kullanıcıdan bir yıl girmesini isteyin, 
		 yıl artık yıl ise ekrana “Artık yıl” degilse ekrana “Artık yıl degil” yazdırın
		 */
			Scanner scan = new Scanner(System.in);
			System.out.println("Bir yil giriniz");
			int a = scan.nextInt();
			String result = a%100 == 0 ? a%400 == 0 ? "Artik yil" : "Artik yil degil" : a%4 == 0 ? "Artik yil" : "Artik yil degil";
			System.out.println(result);
			scan.close();
	}

}
