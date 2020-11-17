package day06ifstatement;

import java.util.Scanner;

public class Ifelse01 {

	public static void main(String[] args) {
		//if it rains i will go to Mall else i will go to picnic
		
		Scanner scan = new Scanner(System.in);
		System.out.println("sayi giriniz");
		int sayi = scan.nextInt();
		
		//if-else sadece 1 tane condition icerir, ikili if ise iki tane condition icerir.
		//Java her conditionu kontrol etmek zorundadir, iki conditioni kontrol etmek daha uzun zaman gerektirir
		//Ve bu da Java'yi yavaslatir.
		if (sayi >=0 ) {
			System.out.println("Negatif degil");
		}else {
			System.out.println("Negatif");
		}
		
		scan.close();
	}

}
