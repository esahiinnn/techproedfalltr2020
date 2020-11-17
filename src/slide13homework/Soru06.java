package slide13homework;

import java.util.Scanner;

public class Soru06 {

	public static void main(String[] args) {
		/*
		 Kullanıcıdan başlangıç ve bitiş  harflerini alın ve başlangıç harfinden başlayıp bitiş harfinde 
		  biten tüm harfleri büyük harf olarak ekrana yazdırın. 
		 Kullanıcının hata yapmadığını farz edin.
		 *
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Baslangic harfini giriniz");
		char bas = scan.next().toUpperCase().charAt(0);
		System.out.println("Bitis harfini giriniz");
		char bit = scan.next().toUpperCase().charAt(0);
		
		char i = bas;
		
		while(i<=bit) {
			System.out.print(i + " ");
			i++;
		}
		scan.close();
	}

}
