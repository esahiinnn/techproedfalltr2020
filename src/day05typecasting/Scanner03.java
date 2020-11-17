	package day05typecasting;

import java.util.Scanner;

public class Scanner03 {

	public static void main(String[] args) {
		// Kullanicinin girdigi 4 basamakli sayinin ilk ve son rakaminin toplamini ekrana yazdiran programi yaziniz.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("4 basamakli bi sayi giriniz");
		int sayi = scan.nextInt();
		int binler = sayi/1000;
		//Bir sayinin birler basamagi lazim olursa %10 kullanilir.
		int birler = sayi%10;
		//4 basamakli bir sayinin ilk rakamini almak icin sayi/1000 kullanilir.
		//5 basamakli bir sayinin ilk rakamini almak icin sayi/10000 kullanilir.
		System.out.println(binler+birler);
		scan.close();
		
		// Kullanicinin girdigi 4 basamakli sayinin ilk ve son rakaminin toplamini ekrana yazdiran programi yaziniz.
		
	}

}
